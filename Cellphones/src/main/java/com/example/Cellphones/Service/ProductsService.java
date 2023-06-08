package com.example.Cellphones.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cellphones.Repository.ProductsRepository;
import com.example.Cellphones.db.Products;

@Service
public class ProductsService {
	@Autowired
	ProductsRepository repoo;
	public List<Products> getall()
	{
		return repoo.findAll();
	}

}
