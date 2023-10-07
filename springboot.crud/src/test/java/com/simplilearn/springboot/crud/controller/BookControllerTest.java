package com.simplilearn.springboot.crud.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.simplilearn.springboot.crud.entity.Book;
import com.simplilearn.springboot.crud.service.BookService;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {

	@Mock
	private BookService bookService;

	@InjectMocks
	private BookController bookController;

	private Book book;

	@BeforeEach
	private void setup() {
		book = new Book();

		book.setBookId(1);
		book.setBookName("Book-1");
		book.setAuthor("John");
		book.setPrice(2000.00);

	}

	@Test
	void getAllBooksTest() {

		Mockito.when(bookService.getAllBooks()).thenReturn(Collections.singletonList(book));

		List<Book> books = bookController.getAllBooks();

		assertEquals(Collections.singletonList(book), books);
	}
	
	@Test
	void saveBookTest() {
		
		Mockito.when(bookService.save(Mockito.any())).thenReturn(1);
		
		int result = bookController.saveBook(book);
		
		assertEquals(1, result);
	}
	
}
