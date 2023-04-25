package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.db.database;
import com.example.springdemo.service.demo;

@RestController

public class javaapp {
	@Autowired
	demo studdemo;
	@GetMapping("/")
	public List<database> getvalues()
	{
		List<database> star=studdemo.getall();
		return star;
	}

}
