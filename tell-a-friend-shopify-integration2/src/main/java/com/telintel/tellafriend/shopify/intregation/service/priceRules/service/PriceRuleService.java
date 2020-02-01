package com.telintel.tellafriend.shopify.intregation.service.priceRules.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telintel.tellafriend.shopify.intregation.service.merchants.MerchantService;
import com.telintel.tellafriend.shopify.intregation.service.priceRules.vo.DPriceRule;
import com.telintel.tellafriend.shopify.intregation.service.priceRules.vo.PriceRule;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;

@Service
public class PriceRuleService {

	private static final String HTTPS_PROTOCOL = "https://";

	private static final String SHOPIFY_API_VERSION = "2019-10";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MerchantService merchantService;

	public ResponseEntity<DPriceRule> getPriceRule(String shop, long priceRuleId) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		// send petition
		String shopRequestUrl = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/price_rules/"
				+ priceRuleId + ".json";
		HttpEntity<Void> httpEntity = new HttpEntity<>(null, headers);

		ResponseEntity<DPriceRule> shopInfo = restTemplate.exchange(shopRequestUrl, HttpMethod.GET, httpEntity,
				DPriceRule.class);
		return shopInfo;

	}

	public ResponseEntity<DPriceRule> createPriceRule(String shop, PriceRule priceRule) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		DPriceRule newPriceRule = new DPriceRule();
		newPriceRule.setPrice_rule(priceRule);

		String url = HTTPS_PROTOCOL + shop + "/admin/api/"+SHOPIFY_API_VERSION+"/price_rules.json";

		HttpEntity<DPriceRule> request = new HttpEntity<>(newPriceRule, headers);

		ResponseEntity<DPriceRule> reponse = restTemplate.postForEntity(url, request, DPriceRule.class);

		return reponse;
	}

	public ResponseEntity<DPriceRule> updatePriceRule(String shop,long priceRuleId, PriceRule priceRule) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		DPriceRule newPriceRule = new DPriceRule();
		newPriceRule.setPrice_rule(priceRule);

		String url = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/price_rules/"
				+ priceRuleId + ".json";

		HttpEntity<DPriceRule> request = new HttpEntity<>(newPriceRule, headers);

		restTemplate.put(url, request, DPriceRule.class);
		
		ResponseEntity<DPriceRule> response = getPriceRule(shop, priceRuleId);
		
		
		return response;

	}
	
	private String getToken(String shop) {

		Optional<MerchantEntity> getToken = merchantService.getByMerchantUrl(shop);
		String token = getToken.get().getShopifyAccessToken();

		return token;

	}

}
