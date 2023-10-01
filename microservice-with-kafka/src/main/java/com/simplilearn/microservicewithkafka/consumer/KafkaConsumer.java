package com.simplilearn.microservicewithkafka.consumer;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.simplilearn.microservicewithkafka.entity.Product;
import com.simplilearn.microservicewithkafka.respository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumer {

	@Autowired
	private ProductRepository productRepo;

	@KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
	public void consume(ConsumerRecord<String, String> payload) {
		Logger logger = LoggerFactory.getLogger(KafkaConsumer.class.getName());
		logger.info("Consumed Product Details: {}", payload.value());
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonParser parser = mapper.createParser(payload.value());
			Product product = parser.readValueAs(Product.class);
			productRepo.save(product);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
