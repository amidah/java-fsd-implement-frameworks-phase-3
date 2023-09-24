package com.simplilearn.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.currencyconversionservice.entity.CurrencyConversionEntity;
import com.simplilearn.currencyconversionservice.service.CurrencyConverterService;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyConverterService currencyConverterService;
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	private CurrencyConversionEntity convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		return currencyConverterService.convertCurrency(from, to, quantity);
	}

}
