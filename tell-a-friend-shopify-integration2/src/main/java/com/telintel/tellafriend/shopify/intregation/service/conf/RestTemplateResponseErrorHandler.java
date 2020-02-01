package com.telintel.tellafriend.shopify.intregation.service.conf;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse httpResponse) throws IOException {

		return (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
				|| httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR);
	}

	@Override
	public void handleError(ClientHttpResponse httpResponse) throws IOException {

		if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
			throw new IOException("Internal Server Error: "
					+ IOUtils.toString(httpResponse.getBody(), StandardCharsets.UTF_8.name()));
		} else if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
			throw new IOException("Bad Request. Code: " + httpResponse.getStatusCode() + ". Response Body: "
					+ IOUtils.toString(httpResponse.getBody(), StandardCharsets.UTF_8.name()));
		}
	}
}
