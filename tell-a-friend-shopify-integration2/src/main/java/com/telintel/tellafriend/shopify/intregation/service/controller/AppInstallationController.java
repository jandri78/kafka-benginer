package com.telintel.tellafriend.shopify.intregation.service.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telintel.tellafriend.shopify.intregation.service.app.AppInstallationService;

@RestController
@RequestMapping("/shopify")
public class AppInstallationController {

	@Autowired
	private AppInstallationService appInstallationService;

	@GetMapping
	public void get(@RequestParam(name = "shop", required = true) String shop, HttpServletResponse response)
			throws IOException {

		String state = UUID.randomUUID().toString() + "-" + System.currentTimeMillis();

		response.addCookie(new Cookie("state", state));
		response.sendRedirect(appInstallationService.authenticate(state, shop));

	}

	@GetMapping("/callback")
	public ResponseEntity<?> callback(HttpServletRequest request,
			@RequestParam(name = "shop", required = true) String shop,
			@RequestParam(name = "hmac", required = false) String hmac,
			@RequestParam(name = "code", required = false) String code,
			@RequestParam(name = "state", required = false) String state,
			HttpServletResponse response) throws IOException {

		// get Cookie
		String cookieState = getCookie(request, "state");

		// Validate cookie
		if (!state.equals(cookieState)) {
			return new ResponseEntity<String>("Request origin cannot be verified", HttpStatus.FORBIDDEN);
		}

		String redirection =  appInstallationService.configure(code, shop);

		response.sendRedirect(redirection);
		return new ResponseEntity<Void>(HttpStatus.MOVED_PERMANENTLY);
	}

	private String getCookie(HttpServletRequest request, String name) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			return Arrays.stream(cookies).filter(c -> c.getName().equals(name)).map(c -> c.getValue())
					.collect(Collectors.joining(", "));
		}
		return null;
	}
}
