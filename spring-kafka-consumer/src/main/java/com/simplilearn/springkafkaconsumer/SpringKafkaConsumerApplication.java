package com.simplilearn.springkafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaConsumerApplication.class, args);
	}

}
