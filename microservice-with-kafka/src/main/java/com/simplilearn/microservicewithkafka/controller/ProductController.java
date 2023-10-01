package com.simplilearn.microservicewithkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.simplilearn.microservicewithkafka.controller.request.ProductRequest;
import com.simplilearn.microservicewithkafka.producer.KafkaProducer;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private KafkaProducer producer;

	@PostMapping("/create")
	public boolean createProduct(@RequestBody ProductRequest request) {
		ObjectMapper mapper = new ObjectMapper();
		String reqJson;
		try {
			reqJson = mapper.writeValueAsString(request);
			producer.send(reqJson);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
