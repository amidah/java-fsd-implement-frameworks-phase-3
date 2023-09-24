package com.simplilearn.demomicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demomicroservice.model.ExchangeValue;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
}
