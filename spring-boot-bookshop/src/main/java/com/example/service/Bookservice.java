package com.example.service;

import java.util.List;

import com.example.beans.Book;

public interface Bookservice {
	
	public List<Book> getall();
	
	public void insert(Book book);
	
	public void delete(Integer ISBN);
	
	public byte[] getBooklistPdf(Book book) throws Exception;
	
	public Book getbykey(Integer ISBN);
	
	public Iterable<Book> inserbook(Book book);
	
	public Iterable<Book> deletebook(Integer ISBN);

}
