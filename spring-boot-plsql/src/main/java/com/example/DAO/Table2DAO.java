package com.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.beans.Table2;
@Component
public interface Table2DAO extends JpaRepository<Table2, Integer> {
	
	
	@Modifying
	@Transactional
	@Query(nativeQuery=true)
	public void copyinserttable();
	
}
