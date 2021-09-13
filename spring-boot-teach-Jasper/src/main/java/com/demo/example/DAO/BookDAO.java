package com.demo.example.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.example.model.Book;

@Component
public interface BookDAO extends JpaRepository<Book, Integer>{
	
}
