package com.telintel.tellafriend.shopify.intregation.service.code.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telintel.tellafriend.shopify.intregation.service.code.vo.DCode;
import com.telintel.tellafriend.shopify.intregation.service.code.vo.DCodes;
import com.telintel.tellafriend.shopify.intregation.service.code.vo.ShopifyCodeVO;
import com.telintel.tellafriend.shopify.intregation.service.merchants.MerchantService;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;

@Service
public class CodeService {
	
	private static final String HTTPS_PROTOCOL = "https://";

	private static final String SHOPIFY_API_VERSION = "2019-10";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MerchantService merchantService;

	public ResponseEntity<DCode> createCode(String shop, ShopifyCodeVO shopifyCode) {

		String token = getToken(shop);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		DCode code = new DCode();
		code.setDiscount_code(shopifyCode);

		String url = "https://" + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/price_rules/"
				+ shopifyCode.getPrice_rule_id() + "/discount_codes.json";

		HttpEntity<DCode> request = new HttpEntity<>(code, headers);

		ResponseEntity<DCode> reponse = restTemplate.postForEntity(url, request, DCode.class);

		return reponse;
	}

	public ResponseEntity<DCode> getCodeById(String shop, String priceRuleId, String codeId) {

		String token = getToken(shop);

		String shopRequestUrl = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/price_rules/"
				+ priceRuleId + "/discount_codes/" + codeId + ".json";

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Void> httpEntity = new HttpEntity<>(null, headers);

		ResponseEntity<DCode> shopInfo = restTemplate.exchange(shopRequestUrl, HttpMethod.GET, httpEntity, DCode.class);
		return shopInfo;

	}

	public ResponseEntity<ShopifyCodeVO> getCodeByCode(String shop, String priceRuleId, String code) {

		String token = getToken(shop);

		String incomingCode = code;

		String shopRequestUrl = HTTPS_PROTOCOL + shop + "/admin/api/" + SHOPIFY_API_VERSION + "/price_rules/"
				+ priceRuleId + "/discount_codes.json";

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Void> httpEntity = new HttpEntity<>(null, headers);

		ResponseEntity<DCodes> shopInfo = restTemplate.exchange(shopRequestUrl, HttpMethod.GET, httpEntity,
				DCodes.class);

		List<ShopifyCodeVO> listCodes = shopInfo.getBody().getDiscount_codes();

		for (ShopifyCodeVO codeVO : listCodes) {

			if (codeVO.getCode().equals(incomingCode)) {

				return new ResponseEntity<ShopifyCodeVO>(codeVO, HttpStatus.FOUND);
			}

		}
		return new ResponseEntity<ShopifyCodeVO>(HttpStatus.NOT_FOUND);

	}

	private String getToken(String shop) {

		Optional<MerchantEntity> getToken = merchantService.getByMerchantUrl(shop);
		String token = getToken.get().getShopifyAccessToken();

		return token;

	}

}
