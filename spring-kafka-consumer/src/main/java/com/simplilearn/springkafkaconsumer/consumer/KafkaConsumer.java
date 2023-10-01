package com.simplilearn.springkafkaconsumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
	
	
	@KafkaListener(topics="${topic.name.consumer}", groupId="${spring.kafka.consumer.group-id}")
	public void consume(ConsumerRecord<String , String> payload) {
		Logger logger = LoggerFactory.getLogger(KafkaConsumer.class.getName());
		logger.info("Consumed payload from {} is {}",payload.topic(), payload.value());
	}

}
