package com.telintel.tellafriend.shopify.intregation.service.webhooks;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telintel.tellafriend.shopify.intregation.service.app.AccessTokenResponse;
import com.telintel.tellafriend.shopify.intregation.service.merchants.MerchantService;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;
import com.telintel.tellafriend.shopify.intregation.service.tellafriendconversion.TellAFriendConversionService;

@Service
public class WebhookService {

	@Value("${tellafriend.shopify.integration.requests.shopinfo}")
	private String createWebhook;

	@Value("${tellafriend.shopify.integration.callbacks.server}")
	private String callbacksServer;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MerchantService merchantService;

	@Autowired
	private TellAFriendConversionService conversionService;

	public void createWebhook(String shop, AccessTokenResponse accessTokenResponse) {

		// build headers
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", accessTokenResponse.getAccessToken());
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Body
		Webhook webhook = new Webhook();

		webhook.setTopic(WebhookTopics.ORDERS_PAID.getTopic());
		webhook.setAddress(callbacksServer + "/webhooks/orderspaid/" + shop);

		WebhookWrapper wrapper = new WebhookWrapper(webhook);

		// send petition
		String postWebhook = createWebhook.replace("#SHOP#", shop);

		HttpEntity<WebhookWrapper> httpEntity = new HttpEntity<>(wrapper, headers);
		restTemplate.postForEntity(postWebhook, httpEntity, WebhookWrapper.class);

	}

	public void process(WebhookEvent event, String shop) throws Exception {
		Optional<MerchantEntity> merchant = merchantService.getByMerchantUrl(shop);
		if (!merchant.isPresent()) {
			return;
		}
		switch (event.getTopic()) {
		case ORDERS_PAID:
			conversionService.processOrderConversion((WebhookPaidOrders) event, merchant.get());
			break;

		default:
			break;
		}

	}

}
