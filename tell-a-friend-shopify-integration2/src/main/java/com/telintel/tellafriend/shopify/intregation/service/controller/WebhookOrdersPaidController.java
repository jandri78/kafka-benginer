package com.telintel.tellafriend.shopify.intregation.service.controller;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telintel.tellafriend.shopify.intregation.service.data.ShopifyPurchaseEvent;
import com.telintel.tellafriend.shopify.intregation.service.webhooks.WebhookPaidOrders;
import com.telintel.tellafriend.shopify.intregation.service.webhooks.WebhookService;

@RestController
@RequestMapping("/webhooks/orderspaid")
public class WebhookOrdersPaidController {

	@Autowired
	private WebhookService webhookService;

	private ExecutorService executor = Executors.newSingleThreadExecutor();

	@PostMapping("/{shop}")
	public ResponseEntity<Void> postWebhook(@PathVariable("shop") String shop, HttpServletRequest request)
			throws Exception {

		final String strBody = extractPostRequestBody(request);
		System.out.println("Arrived Petition to Shop: " + strBody);

		executor.execute(() -> {
			ObjectMapper mapper = new ObjectMapper();
			ShopifyPurchaseEvent eventBody;
			try {
				eventBody = mapper.readValue(strBody, ShopifyPurchaseEvent.class);
				WebhookPaidOrders event = new WebhookPaidOrders(eventBody);
				webhookService.process(event, shop);
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		});

		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	public static String extractPostRequestBody(HttpServletRequest request) throws IOException {

		if ("POST".equalsIgnoreCase(request.getMethod()) || "PUT".equalsIgnoreCase(request.getMethod())) {

			Scanner scanner = null;
			Scanner s = null;

			try {
				scanner = new Scanner(request.getInputStream(), "UTF-8");
				s = scanner.useDelimiter("\\A");
				return s.hasNext() ? s.next() : "";
			} finally {
				scanner.close();
				s.close();
			}
		}

		return "";
	}

}
