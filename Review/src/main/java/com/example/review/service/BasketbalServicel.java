package com.example.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.review.db.Basketball;
import com.example.review.repository.BasketballRepository;

@Service
public class BasketbalServicel {
	@Autowired
	BasketballRepository dserv;
	public List<Basketball> getAll()
	{
		List<Basketball> b=dserv.findAll();
		return b;
	}
	public Basketball savevalues(Basketball v)
	{
		return dserv.save(v);
	}
	public Basketball updatevalues(Basketball v)
	{
		return dserv.save(v);
	}
	public void deletevalues(int no)
	{
		dserv.deleteById(no);
	}

}