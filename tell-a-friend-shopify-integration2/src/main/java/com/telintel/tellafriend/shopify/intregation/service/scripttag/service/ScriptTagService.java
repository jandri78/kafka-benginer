package com.telintel.tellafriend.shopify.intregation.service.scripttag.service;

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
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;
import com.telintel.tellafriend.shopify.intregation.service.scripttag.vo.ScriptTagVO;

@Service
public class ScriptTagService {
	
	private static final String HTTPS_PROTOCOL = "https://";

	private static final String SHOPIFY_API_VERSION = "2019-10";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MerchantService merchantService;

	public ResponseEntity<ScriptTagVO> createScript(String shop, ScriptTagVO scriptTagVO) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		String url = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/script_tags.json/";

		HttpEntity<ScriptTagVO> request = new HttpEntity<>(scriptTagVO, headers);
	
		return restTemplate.postForEntity(url, request, ScriptTagVO.class);
	}
	
	public ResponseEntity<ScriptTagVO> updateScript(String shop, ScriptTagVO scriptTagVO) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		String url = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/script_tags/"
				+ scriptTagVO.getScript_tag().getId() + ".json";

		HttpEntity<ScriptTagVO> request = new HttpEntity<>(scriptTagVO, headers);

		return restTemplate.exchange(url, HttpMethod.PUT, request, ScriptTagVO.class);
	}


	private String getToken(String shop) {

		Optional<MerchantEntity> getToken = merchantService.getByMerchantUrl(shop);
		String token = getToken.get().getShopifyAccessToken();

		return token;

	}

}
