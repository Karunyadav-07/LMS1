package com.nagarro.Assignment5.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.Assignment5.entity.Books;
import com.nagarro.Assignment5.service.BooksService;

@RestController
@RequestMapping("/api")
public class BookRestController {
	private BooksService booksService;

	@Autowired
	public BookRestController(BooksService theBooksService) {
		booksService = theBooksService;
	}

	@GetMapping("/books")
	public List<Books> findAll() {
		return booksService.findAll();
	}

	@GetMapping("/books/{bookId}")
	public Books getBooks(@PathVariable int bookId) {
		Books theBooks = booksService.findByBookCode(bookId);

		if (theBooks == null) {
			throw new RuntimeException("Books code not found: " + bookId);
		}
		return theBooks;
	}

	
	@PostMapping("/books")
	public Books addBooks(@RequestBody Books theBooks) {

		theBooks.setId(0);
		booksService.save(theBooks);
		return theBooks;

	}

	
	@PutMapping("/books")
	public Books updateBooks(@RequestBody Books theBooks) {
		booksService.save(theBooks);
		return theBooks;

	}

	@DeleteMapping("/books/{booksId}")
	public String deleteBooks(@PathVariable int booksId) {
		Books theBooks = booksService.findByBookCode(booksId);
		
		if (theBooks == null) {
			throw new RuntimeException("Books code not found: " + booksId);
		}
		booksService.deleteByBookCode(booksId);
		return "Deleted books id: " + booksId;
	}

}
