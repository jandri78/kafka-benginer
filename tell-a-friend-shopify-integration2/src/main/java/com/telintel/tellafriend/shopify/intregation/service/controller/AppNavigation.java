package com.telintel.tellafriend.shopify.intregation.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.telintel.services.taf.integration.dto.merchant.MerchantTutorialDTO;
import com.telintel.tellafriend.shopify.intregation.service.merchants.MerchantService;
import com.telintel.tellafriend.shopify.intregation.service.repositories.MerchantEntity;
import com.telintel.tellafriend.shopify.intregation.service.tellafriendsecurity.TellAFriendTokenService;

@Controller
@RequestMapping("/")
public class AppNavigation {

	@Value("${tellafriend.shopify.intregation.host.taf}")
	private String hostTellAfriend;

	@Value("${tellafriend.shopify.intregation.parameter.session.taf}")
	private String parameterSession;

	@Value("${tellafriend.shopify.intregation.parameter.session.taf}")
	private String parameterRedirect;

	@Autowired
	private TellAFriendTokenService tokenService;

	@Autowired
	private MerchantService merchantService;

	@Value("${tellafriend.shopify.integration.console.taf:https://cloud.tellafriend.club}")
	private String urlConsole;

	@GetMapping
	public void get(HttpServletRequest request, @RequestParam(name = "shop", required = true) String shop,
			@RequestParam(name = "locale", required = false) String locale, HttpServletResponse response, Model model)
			throws Exception {

		MerchantEntity merchant = merchantService.getByMerchantUrl(shop)
				.orElseThrow(() -> new Exception("shop not found"));

		String token = tokenService.getToken(merchant);

		StringBuilder urlRedirect = new StringBuilder();
		urlRedirect.append(urlConsole);
		urlRedirect.append("?");
		urlRedirect.append(parameterSession);
		urlRedirect.append("=");
		urlRedirect.append(token);
		urlRedirect.append("&isIframe=true");
		
		System.out.println(urlRedirect);

		response.setHeader("Location", urlRedirect.toString());
		response.setStatus(302);
			
	}

}
