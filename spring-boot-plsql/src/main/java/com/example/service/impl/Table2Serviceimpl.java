package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.Table2DAO;
import com.example.service.Table2Service;
@Service
public class Table2Serviceimpl implements Table2Service {
	@Autowired
	private Table2DAO table2dao;

	@Override
	public void dosql() {
		table2dao.copyinserttable();

	}

}
