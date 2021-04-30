package com.demo.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.example.beans.Book;

@Component
public interface BookDAO extends JpaRepository<Book, Integer>{
	
}
