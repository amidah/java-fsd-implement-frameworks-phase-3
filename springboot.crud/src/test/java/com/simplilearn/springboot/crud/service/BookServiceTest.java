package com.simplilearn.springboot.crud.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.simplilearn.springboot.crud.entity.Book;
import com.simplilearn.springboot.crud.respository.BookRespository;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	
	@Mock
	private BookRespository bookRespository;
	
	@InjectMocks
	private BookService bookService;
	
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
		
		Mockito.when(bookRespository.findAll()).thenReturn(Collections.singletonList(book));
		
		List<Book> books = bookService.getAllBooks();
		
		assertEquals(Collections.singletonList(book), books);
	}

}
