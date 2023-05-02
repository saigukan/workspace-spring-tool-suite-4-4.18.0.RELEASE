package com.example.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review.db.Basketball;
import com.example.review.service.BasketbalServicel;

@RestController
public class BasketballController {
	@Autowired
	BasketbalServicel dbask;
	@GetMapping("/first")
	public List<Basketball> getdo()
	{
		List<Basketball> a=dbask.getAll();
		return a;
	}
	@PostMapping("/post")
	public Basketball savevalues(@RequestBody Basketball c)
	{
		return dbask.savevalues(c);
	}
	@PutMapping("/put")
	public Basketball uppdatevalues(@RequestBody Basketball c)
	{
		return dbask.updatevalues(c);
	}
	@DeleteMapping("/delete/{num}")
	public void deletevalues(@PathVariable("num") int no)
	{
		dbask.deletevalues(no);
	}
	@GetMapping("/sort/{no}")
	public List<Basketball> sortall(@PathVariable String no)
	{
		return dbask.sortall(no);
	}
	@GetMapping("/pagingandsort/{offset}/{pageSize}/{field}")

	public List<Basketball> pagingAndSortingEmployees(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
	{
		return dbask.pagingAndSortingEmployees(offset, pageSize, field);
	}
	


}
