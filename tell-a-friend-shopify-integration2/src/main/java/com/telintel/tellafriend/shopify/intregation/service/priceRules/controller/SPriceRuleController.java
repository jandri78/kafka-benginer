package com.telintel.tellafriend.shopify.intregation.service.priceRules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telintel.tellafriend.shopify.intregation.service.priceRules.service.PriceRuleService;
import com.telintel.tellafriend.shopify.intregation.service.priceRules.vo.DPriceRule;
import com.telintel.tellafriend.shopify.intregation.service.priceRules.vo.PriceRule;

@RestController
@RequestMapping("/pricerule")
public class SPriceRuleController {

	@Autowired
	private PriceRuleService priceRuleService;

	@PostMapping
	public ResponseEntity<DPriceRule> postPriceRule(
			@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestBody PriceRule priceRule) {

		ResponseEntity<DPriceRule> response = priceRuleService.createPriceRule(shop, priceRule);

		return response;
	}

	@GetMapping
	public ResponseEntity<DPriceRule> getPriceRule(
			@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestParam(name = "priceRuleId", value = "priceRuleId", required = true) long priceRuleId) {

		ResponseEntity<DPriceRule> responde = priceRuleService.getPriceRule(shop, priceRuleId);

		return responde;
	}
	
	
	@PutMapping
	public ResponseEntity<DPriceRule> putPriceRule(
			@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestParam(name = "priceRuleId", value = "priceRuleId", required = true) long priceRuleId,
			@RequestBody PriceRule priceRule) {

		ResponseEntity<DPriceRule> response = priceRuleService.updatePriceRule(shop, priceRuleId, priceRule);
		return response;
	}

}
