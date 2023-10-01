package com.simplilearn.microservicewithkafka.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.microservicewithkafka.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
