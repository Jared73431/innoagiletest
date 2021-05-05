package com.demo.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.demo.example.beans.Users;

@Component
public interface Userdao extends JpaRepository<Users, Long> {
	
	@Modifying
	@Transactional
	@Query(value = "select * from users where email=email",nativeQuery=true)
	Users findByEmailAddress(@Param("email") String email);
}
