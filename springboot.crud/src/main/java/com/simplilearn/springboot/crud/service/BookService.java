package com.simplilearn.springboot.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.springboot.crud.entity.Book;
import com.simplilearn.springboot.crud.respository.BookRespository;

@Service
public class BookService {

	@Autowired
	private BookRespository bookRespository;

	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		bookRespository.findAll().forEach(book -> books.add(book));
		return books;
	}

	public int save(Book book) {
		Book savedBook = bookRespository.save(book);
		return savedBook.getBookId();
	}

	public List<Integer> saveAll(List<Book> books) {
		Iterable<Book> savedBooks = bookRespository.saveAll(books);
		List<Integer> bookIds = new ArrayList<>();
		// todo => fill bookIds with the help of savedBooks
		return bookIds;
	}

	public int update(Book book) {
		return save(book);
	}

	public void deleteBookById(int id) {
		bookRespository.deleteById(id);
	}
}
