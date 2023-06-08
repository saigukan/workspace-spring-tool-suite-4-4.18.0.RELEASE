package com.example.Cellphones.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cellphones.Repository.CartRepository;
import com.example.Cellphones.db.Cart;

@Service
public class CartService {
	@Autowired
	CartRepository crep;
	public List<Cart> getall()
	{
		return crep.findAll();
	}
	public Cart add(Cart c)
	{
		return crep.save(c);
	}
	public void deleteall()
	{
		crep.deleteAll();
	}
	


}
