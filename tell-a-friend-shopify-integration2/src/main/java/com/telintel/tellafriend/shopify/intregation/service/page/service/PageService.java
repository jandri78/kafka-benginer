package com.telintel.tellafriend.shopify.intregation.service.page.service;

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
import com.telintel.tellafriend.shopify.intregation.service.page.vo.PageVO;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;

@Service
public class PageService {

	private static final String HTTPS_PROTOCOL = "https://";

	private static final String SHOPIFY_API_VERSION = "2019-10";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MerchantService merchantService;

	public ResponseEntity<PageVO> createPage(String shop, PageVO pageVO) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		String url = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/pages.json/";

		HttpEntity<PageVO> request = new HttpEntity<>(pageVO, headers);

		return restTemplate.postForEntity(url, request, PageVO.class);
	}

	public ResponseEntity<PageVO> updatePage(String shop, PageVO pageVO) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		String url = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/pages/" + pageVO.getPage().getId()
				+ ".json";

		HttpEntity<PageVO> request = new HttpEntity<>(pageVO, headers);

		return restTemplate.exchange(url, HttpMethod.PUT, request, PageVO.class);
	}

	private String getToken(String shop) {

		Optional<MerchantEntity> getToken = merchantService.getByMerchantUrl(shop);
		String token = getToken.get().getShopifyAccessToken();

		return token;

	}

}
