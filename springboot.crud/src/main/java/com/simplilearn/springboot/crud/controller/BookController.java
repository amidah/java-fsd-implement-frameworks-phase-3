package com.simplilearn.springboot.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.springboot.crud.entity.Book;
import com.simplilearn.springboot.crud.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookServie;
	
	@GetMapping("/books")
	private List<Book> getAllBooks(){
		
		return bookServie.getAllBooks();
		
	}
	
	@PostMapping("/save/book")
	private int saveBook(@RequestBody Book book) {
		return bookServie.save(book);
	}
	
	
	
}
