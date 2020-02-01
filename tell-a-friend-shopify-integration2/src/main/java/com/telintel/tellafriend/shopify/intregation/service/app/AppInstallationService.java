package com.telintel.tellafriend.shopify.intregation.service.app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telintel.tellafriend.shopify.intregation.service.merchants.MerchantService;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;
import com.telintel.tellafriend.shopify.intregation.service.tellafriendsecurity.TellAFriendTokenService;
import com.telintel.tellafriend.shopify.intregation.service.webhooks.WebhookService;

@Service
public class AppInstallationService {

	@Value("${tellafriend.shopify.integration.api.key}")
	private String apiKey;

	@Value("${tellafriend.shopify.integration.api.secret}")
	private String apiSecret;

	@Value("${tellafriend.shopify.integration.scopes}")
	private String scopes;

	@Value("${tellafriend.shopify.integration.forwarding.address}")
	private String forwardingAddress;

	@Value("${tellafriend.shopify.integration.forwarding.address.protocol}")
	private String protocol;

	@Value("${tellafriend.shopify.integration.access.token.url}")
	private String accessTokenRequestPath;

	@Value("${tellafriend.shopify.integration.merchant.url}")
	private String urlRedirection;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private TellAFriendTokenService tokenService;

	@Autowired
	private MerchantService merchantService;

	@Autowired
	private WebhookService webhookService;

	public String authenticate(String state, String shopUrl) {

		StringBuilder urlRedirect = new StringBuilder();
		urlRedirect.append(protocol);
		urlRedirect.append(shopUrl);
		urlRedirect.append("/admin/oauth/authorize?client_id=");
		urlRedirect.append(apiKey);
		urlRedirect.append("&scope=");
		urlRedirect.append(scopes);
		urlRedirect.append("&state=");
		urlRedirect.append(state);
		urlRedirect.append("&redirect_uri=");
		urlRedirect.append(forwardingAddress);

		System.out.println("urlRedirect: " + urlRedirect);

		return urlRedirect.toString();

	}

	public String configure(String code, String shop) {

		// get access token
		String accessTokenRequestUrl = protocol + shop + accessTokenRequestPath;
		AccessTokenPayload accessTokenPayload = new AccessTokenPayload(apiKey, apiSecret, code);
		AccessTokenResponse accessTokenResponse = restTemplate.postForObject(accessTokenRequestUrl, accessTokenPayload,
				AccessTokenResponse.class);

		Optional<MerchantEntity> existingMerchant = merchantService.getByMerchantUrl(shop);
		
		MerchantEntity merchant = null;
		if (existingMerchant.isPresent()) {
			merchant = existingMerchant.get();
		} else {
			merchant = merchantService.createMerchant(shop, accessTokenResponse);
		}
		
		String token = tokenService.getToken(merchant);
		webhookService.createWebhook(shop, accessTokenResponse);

		return urlRedirection.replace("#SESSION_ID#", token);

	}

}
