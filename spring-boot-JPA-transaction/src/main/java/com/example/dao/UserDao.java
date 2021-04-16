package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.bean.User;

public interface UserDao extends JpaRepository<User,Long>{

@Query(value = "update Studnet set name=?1 where id=?2 ", nativeQuery = true)  
@Transactional
@Modifying  
	void update(User user);

}
