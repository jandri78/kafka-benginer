package com.telintel.tellafriend.shopify.intregation.service.page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telintel.tellafriend.shopify.intregation.service.page.service.PageService;
import com.telintel.tellafriend.shopify.intregation.service.page.vo.PageVO;

@RestController
@RequestMapping("/page")
public class PageController {

	@Autowired
	private PageService pageService;
	
	@PostMapping
	public ResponseEntity<PageVO> createPage(@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestBody PageVO pageVO) {
	
		return pageService.createPage(shop, pageVO);
	}
	
	@PutMapping
	public ResponseEntity<PageVO> updatePage(@RequestParam(name = "shop", value = "shop", required = true) String shop,
			@RequestBody PageVO pageVO) {
	
		return pageService.updatePage(shop, pageVO);
	}

}
