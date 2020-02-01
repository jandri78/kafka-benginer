
package com.telintel.tellafriend.shopify.intregation.service.tellafriendsecurity;

import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;

@Service
public class TellAFriendTokenService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${tellafriend.shopify.intregation.host.taf}")
	private String host;

	@Value("${tellafriend.shopify.integration.path.ouath}")
	private String tokenPath;

	public String getToken(MerchantEntity merchant) {

		String credentials = "TAF:TAF";
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String auth = "Basic " + encodedCredentials;
		headers.add("Authorization", auth);

		TellAFriendAccessTokenRequest tokenRequest = new TellAFriendAccessTokenRequest(merchant.getTafApiKey(),
				merchant.getTafApiSecret(), "api");

		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("apikey", tokenRequest.getApikey());
		map.add("apisecret", tokenRequest.getApisecret());
		map.add("grant_type", tokenRequest.getGrantType());

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

		String authUrl = host + tokenPath;

		ResponseEntity<String> response = restTemplate.postForEntity(authUrl, request, String.class);
		ObjectMapper mapper = new ObjectMapper();
		try {
			TellAFriendAccessTokenResponse responseToken = mapper.readValue(response.getBody(),
					TellAFriendAccessTokenResponse.class);
			System.out.println(responseToken);
			return responseToken.getAccessToken();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;

	}

}
