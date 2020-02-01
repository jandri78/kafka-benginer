package com.telintel.tellafriend.shopify.intregation.service.merchants;

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

import com.telintel.services.taf.integration.vo.AccountCreationResponseVO;
import com.telintel.telintelutils.security.Encryptor;
import com.telintel.tellafriend.shopify.intregation.service.app.AccessTokenResponse;
import com.telintel.tellafriend.shopify.intregation.service.app.Shop;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntityRepository;

@Service
public class MerchantService {

	@Autowired
	private MerchantEntityRepository repository;

	@Value("${tellafriend.shopify.integration.shopify.requests.shopinfo}")
	private String shopInfo;

	@Autowired
	private TellAFriendIntegration tellAFriendIntegration;

	@Autowired
	private RestTemplate restTemplate;

	@Value("${encryption.password:Pass4Key}")
	private String encryptionPassword;

	public MerchantEntity create(MerchantEntity entity) {
		return repository.save(entity);
	}

	public MerchantEntity createMerchant(String shop, AccessTokenResponse accessTokenResponse) {
		// build headers
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Shopify-Access-Token", accessTokenResponse.getAccessToken());
		headers.setContentType(MediaType.APPLICATION_JSON);

		// send petition
		String shopRequestUrl = shopInfo.replace("#SHOP#", shop);
		HttpEntity<Void> httpEntity = new HttpEntity<>(null, headers);
		ResponseEntity<Shop> shopInfoValue = restTemplate.exchange(shopRequestUrl, HttpMethod.GET, httpEntity,
				Shop.class);

		// create merchant
		AccountCreationResponseVO newMerchant = tellAFriendIntegration.createMerchant(shopInfoValue.getBody());

		MerchantEntity merchant = new MerchantEntity();
		merchant.setMerchantUrl(shopInfoValue.getBody().getShop().getDomain());
		merchant.setTafApiKey(Encryptor.roll(accessTokenResponse.getAccessToken(), encryptionPassword));
		merchant.setTafApiKey(Encryptor.roll(newMerchant.getApiKey(), encryptionPassword));
		merchant.setTafApiKey(Encryptor.roll(newMerchant.getApiSecret(), encryptionPassword));
		merchant.setTafMerchantId(newMerchant.getMerchantId());
		return create(merchant);
	}

	public MerchantEntity findByMerchantId(String merchantid) {

		MerchantEntity merchant = repository.findByTafMerchantId(merchantid).orElse(null);
		decryptFields(merchant);
		return merchant;

	}

	private void decryptFields(MerchantEntity merchant) {
		if (merchant != null) {
			merchant.setShopifyAccessToken(Encryptor.unroll(merchant.getShopifyAccessToken(), encryptionPassword));
			merchant.setTafApiKey(Encryptor.unroll(merchant.getTafApiKey(), encryptionPassword));
			merchant.setTafApiSecret(Encryptor.unroll(merchant.getTafApiSecret(), encryptionPassword));
		}
	}

	public Optional<MerchantEntity> findByTafMerchantId(String tafMerchantId) {
		Optional<MerchantEntity> merchant = repository.findByTafMerchantId(tafMerchantId);

		if (merchant.isPresent()) {
			decryptFields(merchant.get());
		}

		return merchant;
	}

	public Optional<MerchantEntity> getByMerchantUrl(String url) {
		Optional<MerchantEntity> merchant = repository.findByMerchantUrl(url);

		if (merchant.isPresent()) {
			decryptFields(merchant.get());
		}

		return merchant;

	}

}
