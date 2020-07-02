package com.telintel.tellafriend.shopify.intregation.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class TellAFriendShopifyIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TellAFriendShopifyIntegrationApplication.class, args);
	}

}