package com.simplilearn.microservicewithkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumer {

	@KafkaListener(topics="${topic.name}", groupId="${spring.kafka.consumer.group-id}")
	public void consume(ConsumerRecord<String , String> payload) {
		Logger logger = LoggerFactory.getLogger(KafkaConsumer.class.getName());
		logger.info("Consumed Product Details: {}", payload.value());
	}
}
