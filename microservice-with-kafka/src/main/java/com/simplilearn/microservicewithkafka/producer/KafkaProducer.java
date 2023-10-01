package com.simplilearn.microservicewithkafka.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class KafkaProducer {
	
	@Value("${topic.name}")
	private String topicName;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send(String message) {
		
		kafkaTemplate.send(topicName, message);
	}

}
