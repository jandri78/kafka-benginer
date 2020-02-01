package com.telintel.tellafriend.shopify.intregation.service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telintel.services.taf.integration.dto.merchant.MerchantTutorialDTO;
import com.telintel.tellafriend.shopify.intregation.service.merchants.MerchantService;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;
import com.telintel.tellafriend.shopify.intregation.service.tellafriendsecurity.TellAFriendTokenService;

@Service
public class AppNavigationService {

	@Autowired
	private TellAFriendTokenService tokenService;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MerchantService merchantService;

	@Value("${tellafriend.shopify.intregation.host.taf}")
	private String host;

	@Value("${tellafriend.shopify.integration.merchan.status.path}")
	private String accountStatusPath;

	@Value("${tellafriend.shopify.integration.account.status.url}")
	private String referralProgramStatusPath;

	public MerchantTutorialDTO getAccountStatus(String shop) {

		Optional<MerchantEntity> merchant = merchantService.getByMerchantUrl(shop);
		if (!merchant.isPresent()) {
			return new MerchantTutorialDTO();
		}

		String token = tokenService.getToken(merchant.get());

		// build headers
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		// send petition
		HttpEntity<Void> httpEntity = new HttpEntity<>(null, headers);

		String accountStatusUrl = host + accountStatusPath;
		ResponseEntity<MerchantTutorialDTO> status = restTemplate.exchange(accountStatusUrl, HttpMethod.GET, httpEntity,
				MerchantTutorialDTO.class);

		return status.getBody();

	}

	public Boolean getStatus(String shop) throws Exception {

		Optional<MerchantEntity> merchant = merchantService.getByMerchantUrl(shop);
		if (!merchant.isPresent()) {
			throw new Exception("shop not found");
		}

		String token = tokenService.getToken(merchant.get());
		// build headers
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		// send petition
		HttpEntity<Void> httpEntity = new HttpEntity<>(null, headers);

		String referralProgramStatusUrl = host + referralProgramStatusPath;
		ResponseEntity<Boolean> status = restTemplate.exchange(
				referralProgramStatusUrl + "/" + merchant.get().getTafMerchantId(), HttpMethod.GET, httpEntity,
				Boolean.class);

		return status.getBody();

	}

}
