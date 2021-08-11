package com.demo.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.example.model.JasperOut;

@Component
public interface JasperDAO extends JpaRepository<JasperOut,Integer>{

}
