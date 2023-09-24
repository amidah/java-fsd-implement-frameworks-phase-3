package com.simplilearn.demomicroservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demomicroservice.model.ExchangeValue;
import com.simplilearn.demomicroservice.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeService currencyExchangeService;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	private ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		return currencyExchangeService.findCurrencyMultipleByFromAndTo(from, to);
	}
	
}
