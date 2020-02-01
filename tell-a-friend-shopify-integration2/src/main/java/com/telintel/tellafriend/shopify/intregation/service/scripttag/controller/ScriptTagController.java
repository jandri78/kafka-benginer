package com.telintel.tellafriend.shopify.intregation.service.scripttag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telintel.tellafriend.shopify.intregation.service.scripttag.service.ScriptTagService;
import com.telintel.tellafriend.shopify.intregation.service.scripttag.vo.ScriptTagVO;

@RestController
@RequestMapping("/scripttag")
public class ScriptTagController {

	@Autowired
	private ScriptTagService codeService;
	
	@PostMapping
	public ResponseEntity<ScriptTagVO> createScriptTag(@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestBody ScriptTagVO scriptTagVO) {
	
		return codeService.createScript(shop, scriptTagVO);
	}
	
	@PutMapping
	public ResponseEntity<ScriptTagVO> updateScriptTag(@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestBody ScriptTagVO scriptTagVO) {
	
		return codeService.createScript(shop, scriptTagVO);
	}

}
