package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Book;
import com.example.demo.repo.BooksRepository;

@Controller
@RequestMapping("/books")
public class BooksController {
	@Autowired
	private BooksRepository booksRepository;

	@GetMapping
	public String listBooks(Model model) {
		List<Book> books = booksRepository.findAll();
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping("/{id}")
	public String oneBook(Model model,
			@PathVariable("id") Integer book_id) {
		Optional<Book> maybeBook = booksRepository.findById(book_id);
		
		if(maybeBook.isPresent()) {
			model.addAttribute("book", maybeBook.get());
			return "book";
		}else {
			model.addAttribute("id", book_id);
			return "missing_book";
		}
		
	}
			
			
}
