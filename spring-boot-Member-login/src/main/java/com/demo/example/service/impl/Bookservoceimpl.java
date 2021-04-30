package com.demo.example.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.beans.Book;
import com.demo.example.dao.BookDAO;
import com.demo.example.service.Bookservice;


@Service
public class Bookservoceimpl implements Bookservice {
	@Autowired
	private BookDAO bookDAO;

	@Override
	public List<Book> getall() {
		List<Book> booklist = bookDAO.findAll();
		return booklist;
	}

	@Override
	public void insert(Book book) {
		bookDAO.save(book);

	}

	@Override
	public void delete(Integer ISBN) {
		bookDAO.deleteById(ISBN);

	}


	@Override
	public Book getbykey(Integer ISBN) {
		Book book = bookDAO.findById(ISBN).orElseThrow();
		return book;
	}

	@Override
	public Iterable<Book> inserbook(Book book) {
		bookDAO.save(book);
		return getall();
	}

	@Override
	public Iterable<Book> deletebook(Integer ISBN) {
		bookDAO.deleteById(ISBN);
		return getall();
	}

}
