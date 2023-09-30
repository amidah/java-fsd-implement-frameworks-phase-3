package com.simplilearn.springproducerconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringProducerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProducerConsumerApplication.class, args);
	}

}
