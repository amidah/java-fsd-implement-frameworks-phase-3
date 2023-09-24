package com.simplilearn.demomicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demomicroservice.model.ExchangeValue;
import com.simplilearn.demomicroservice.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeService {

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	
	public ExchangeValue findCurrencyMultipleByFromAndTo(String from, String to) {
		return currencyExchangeRepository.findByFromAndTo(from, to);
	}
	
}


