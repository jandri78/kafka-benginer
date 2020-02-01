package com.telintel.tellafriend.shopify.intregation.service.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantEntityRepository extends JpaRepository<MerchantEntity, String> {

	Optional<MerchantEntity> findByMerchantUrl(String url);

	Optional<MerchantEntity> findByTafMerchantId(String tafMerchantId);

}
