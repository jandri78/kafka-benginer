package com.telintel.tellafriend.shopify.intregation.service.merchants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telintel.services.taf.integration.types.EcommerceProviders;
import com.telintel.services.taf.integration.vo.AccountCreationRequestVO;
import com.telintel.services.taf.integration.vo.AccountCreationResponseVO;
import com.telintel.tellafriend.shopify.intregation.service.app.Shop;

@Service
public class TellAFriendIntegration {

	@Value("${tellafriend.shopify.intregation.host.taf}")
	private String host;

	@Value("${tellafriend.shopify.integration.signup.path}")
	private String signUpPath;

	@Autowired
	private RestTemplate restTemplate;

	private static final Logger log = LoggerFactory.getLogger(TellAFriendIntegration.class);

	public AccountCreationResponseVO createMerchant(Shop shop) {

		try {
//
//			String signUpUrl = host + signUpPath;
//			return restTemplate.postForObject(signUpUrl, shop, AccountCreationResponseVO.class);
			
			AccountCreationRequestVO request = new AccountCreationRequestVO();
			request.setEcommerceProvider(EcommerceProviders.SHOPIFY);
			request.setEmail(shop.getShop().getEmail());
			request.setFullName(shop.getShop().getName());
			request.setStoreName(shop.getShop().getName());
			request.setStoreUrl(shop.getShop().getDomain());
			request.setMobileNumber(shop.getShop().getPhone());

			String signUpUrl = host + signUpPath;
			AccountCreationResponseVO response = restTemplate.postForObject(signUpUrl, request,
					AccountCreationResponseVO.class);

			return response;

		} catch (Exception e) {
			log.error("exception", e);
			throw e;
		}

	}

}
