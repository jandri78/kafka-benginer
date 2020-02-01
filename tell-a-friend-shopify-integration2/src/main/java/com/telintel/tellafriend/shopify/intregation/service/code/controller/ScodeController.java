package com.telintel.tellafriend.shopify.intregation.service.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telintel.tellafriend.shopify.intregation.service.code.service.CodeService;
import com.telintel.tellafriend.shopify.intregation.service.code.vo.DCode;
import com.telintel.tellafriend.shopify.intregation.service.code.vo.ShopifyCodeVO;

@RestController
@RequestMapping("/code")
public class ScodeController {

	@Autowired
	private CodeService codeService;

	@PostMapping
	public ResponseEntity<DCode> postCode(@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestBody ShopifyCodeVO shopifyCodeVO) {

		ResponseEntity<DCode> response = codeService.createCode(shop, shopifyCodeVO);

		return response;
	}

	@GetMapping("/code")
	public ResponseEntity<ShopifyCodeVO> getCodeByCode(
			@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestParam(name = "priceRuleId", value = "priceRuleId", required = true) String priceRuleId,
			@RequestParam(name = "code", value = "code", required = true) String code) {

		ResponseEntity<ShopifyCodeVO> response = codeService.getCodeByCode(shop, priceRuleId, code);

		return response;
	}

	@GetMapping("/id")
	public ResponseEntity<DCode> getCodeById(@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestParam(name = "priceRuleId", value = "priceRuleId", required = true) String priceRuleId,
			@RequestParam(name = "codeId", value = "codeId", required = true) String codeId) {

		ResponseEntity<DCode> response = codeService.getCodeById(shop, priceRuleId, codeId);

		return response;
	}

}
