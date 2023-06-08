package com.example.Cellphones.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cellphones.Service.ProductsService;
import com.example.Cellphones.db.Products;

@RestController
@CrossOrigin
public class ProductsController {
	@Autowired
	ProductsService sserv;
	@GetMapping(value="/getproducts")
	public List<Products> getall()
	{
		return sserv.getall();
	}

}
