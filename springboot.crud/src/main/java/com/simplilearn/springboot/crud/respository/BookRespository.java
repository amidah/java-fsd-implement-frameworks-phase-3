package com.simplilearn.springboot.crud.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.springboot.crud.entity.Book;

@Repository
public interface BookRespository extends CrudRepository<Book, Integer>{

}
