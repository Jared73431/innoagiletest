package com.demo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.example.beans.Book;
import com.demo.example.service.Bookservice;


@Controller
public class Bookshopcontroller {

	@Autowired
	Bookservice bookservice;

	@ResponseBody
	@GetMapping("/getbook")
	public List<Book> getall() {
		List<Book> booklist = bookservice.getall();
		return booklist;
	}

	@ResponseBody
	@PostMapping("/savebook")
	public String savebook(@RequestParam(value = "ISBN", required = true) int ISBN,
			@RequestParam(value = "title", required = true) String title,
			@RequestParam(value = "author", required = true) String author,
			@RequestParam(value = "year", required = true) int year,
			@RequestParam(value = "publisher", required = true) String publisher,
			@RequestParam(value = "cost", required = true) double cost) {
		Book book = new Book();
		book.setISBN(ISBN);
		book.setTitle(title);
		book.setAuthor(author);
		book.setYear(year);
		book.setPublisher(publisher);
		book.setCost(cost);
		bookservice.insert(book);
		return "successful";
	}

	@ResponseBody
	@PostMapping("/deletebookpost")
	public void deletebookpost(@RequestParam(value = "ISBN", required = true) int ISBN) {
		bookservice.delete(ISBN);
	}

	@ResponseBody
	@GetMapping("/deletebookget/{ISBN}")
	public void deletebookget(@PathVariable(value = "ISBN") int ISBN) {
		bookservice.delete(ISBN);
	}


	@ResponseBody
	@GetMapping("/getbookbykey/{ISBN}")
	public Book getbykey(@PathVariable(value = "ISBN") int ISBN) {
		Book booklist = bookservice.getbykey(ISBN);
		return booklist;
	}

	@GetMapping("/todos")
	public String getBook(Model model) {
		List<Book> bookList = bookservice.getall();
		model.addAttribute("bookList", bookList);
		Book book = new Book();
		model.addAttribute("book", book);
		System.out.println(model);
		return "booklist";
	}

	@PostMapping("/add")
	public String creatbook(@ModelAttribute Book book, Model model) {
		Iterable<Book> Book = bookservice.inserbook(book);
		Book emptybook = new Book();
		model.addAttribute("Book", Book);
		model.addAttribute("emptybook", emptybook);
		return "redirect:/todos";
	}
	@ResponseBody
	@DeleteMapping("/todos/{id}")
	    public String deleteTodo(@PathVariable Integer ISBN) {
		bookservice.deletebook(ISBN);
		return "redirect:/todos";
	    }
}
