package com.simplilearn.currencyconversionservice.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.currencyconversionservice.entity.CurrencyConversionEntity;

@Service
public class CurrencyConverterService {

	public CurrencyConversionEntity convertCurrency(String from, String to, BigDecimal quantity) {

		Map<String, String> uriValues = new HashMap<>();

		uriValues.put("from", from);
		uriValues.put("to", to);

		ResponseEntity<CurrencyConversionEntity> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8081/currency-exchange/from/{from}/to/{to}", CurrencyConversionEntity.class,
				uriValues);

		CurrencyConversionEntity response = responseEntity.getBody();

		return new CurrencyConversionEntity(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()));
	}
}
