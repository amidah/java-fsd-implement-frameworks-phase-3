package com.simplilearn.springproducerconsumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.springproducerconsumer.producer.KafkaProducer;


@RestController
@RequestMapping(value="/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@PostMapping(value="/send")
	private void send(@RequestBody String message) {
		kafkaProducer.send(message);
	}

}
