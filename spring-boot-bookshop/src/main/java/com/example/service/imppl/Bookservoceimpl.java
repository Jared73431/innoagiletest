package com.example.service.imppl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.BookDAO;
import com.example.beans.Book;
import com.example.service.Bookservice;
import com.example.util.BookjasperUtil;

@Service
public class Bookservoceimpl implements Bookservice {
	@Autowired
	private BookDAO bookDAO;
	@Autowired
	BookjasperUtil bookutil;

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
	public byte[] getBooklistPdf(Book book) throws Exception {
		String template = "templates/Booklist.jrxml";
		Map<String, Object> bookmap = new HashMap<>();
		BeanUtils.describe(book).forEach((k, v) -> bookmap.put(k, v));
		
		return bookutil.exportFormJrxml(template, bookmap);
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
