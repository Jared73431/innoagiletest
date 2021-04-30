package com.demo.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.example.beans.User;
@Component
public interface Userdao extends JpaRepository<User, Long> {

}
