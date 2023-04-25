package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.db.database;
import com.example.springdemo.repositary.finish;
@Service

public class demo {
	@Autowired
	finish studfinish;
	public List<database> getall()
	{
		List<database> data=studfinish.findAll();
		return data;
	}

}
