package com.telintel.tellafriend.shopify.intregation.service.tellafriendconversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.telintel.services.taf.integration.vo.ConversionResponseVO;
import com.telintel.tellafriend.shopify.intregation.service.data.ShopifyPurchaseEvent;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;
import com.telintel.tellafriend.shopify.intregation.service.tellafriendsecurity.TellAFriendTokenService;
import com.telintel.tellafriend.shopify.intregation.service.webhooks.WebhookPaidOrders;

@Service
public class TellAFriendConversionService {

	@Autowired
	private TellAFriendTokenService tokenService;

	@Value("${tellafriend.shopify.integration.conversion.url:http://premerchant.tellafriend.club:9040/tellafriend/api/merchant/conversions/processconversion}")
	private String conversionUrl;

	@Autowired
	private RestTemplate restTemplate;

	public void processOrderConversion(WebhookPaidOrders paidOrder, MerchantEntity merchant) throws Exception {

		String token = tokenService.getToken(merchant);

		// build headers
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + token);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("ecommerceProvider", "SHOPIFY");

		// send petition
		HttpEntity<ShopifyPurchaseEvent> httpEntity = new HttpEntity<>(paidOrder.getEvent(), headers);
		Gson gson = new Gson();
		String json = gson.toJson(paidOrder.getEvent());
		System.out.println("Conversion REQUEST: " + json);
		ResponseEntity<ConversionResponseVO> conversionResponse = restTemplate.exchange(conversionUrl, HttpMethod.POST,
				httpEntity, ConversionResponseVO.class);

		System.out.println("Conversion RESPONSE: " + conversionResponse);

	}


}
