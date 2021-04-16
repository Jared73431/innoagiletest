package com.bhait.kela.server.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bhaiti.kela.server.main.beans.Student;

@Component
public interface StudentDAO extends JpaRepository<Student, Integer> {

	public List<Student> findAll();

//	@Modifying
//	@Query(value = "insert into student (age,name,registration_number) values (:age,:name,:registration_number)",nativeQuery=true)
//	public Student save(@Param("age")int age,@Param("name")String name,@Param("registration_number")String registrationNumber);
//	

	@Modifying
	@Transactional
	@Query(value = "delete from student where student.name=:name",nativeQuery=true)
	public void deleteByname(@Param("name")String name);

}
