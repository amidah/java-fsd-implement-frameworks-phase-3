package com.simplilearn.springproducerconsumer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Value("${topic.name.producer}")
	private String topicName;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send(String message) {
		kafkaTemplate.send(topicName, message);
	}
}
