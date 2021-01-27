package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

}
