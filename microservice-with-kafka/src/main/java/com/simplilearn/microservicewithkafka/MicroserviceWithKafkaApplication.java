package com.simplilearn.microservicewithkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MicroserviceWithKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWithKafkaApplication.class, args);
	}

}
