package com.simplilearn.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.springboot.crud.entity.Book;
import com.simplilearn.springboot.crud.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookServie;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return bookServie.getAllBooks();
		
	}
	
	@PostMapping("/save/book")
	public int saveBook(@RequestBody Book book) {
		return bookServie.save(book);
	}
	
	@PostMapping("/save/books")
	public List<Integer> saveAllBooks(@RequestBody List<Book> books) {
		return bookServie.saveAll(books);
	}
	
	
	@PutMapping("/update/book")
	public int updateBook(@RequestBody Book book) {
		return bookServie.update(book);
	}
	
	@DeleteMapping("/delete/book/{bookid}")
	public void deleteBook(@PathVariable("bookid") int bookId) {
		bookServie.deleteBookById(bookId);
	}
	
}
