package com.example.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.beans.Book;
@Component
public interface BookDAO extends JpaRepository<Book, Integer>{
	
}
