package com.example.Cellphones.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cellphones.Repository.BillRepository;
import com.example.Cellphones.db.Bill;
@Service
public class BillService {
	@Autowired
	BillRepository brep;
	public Bill add(Bill b)
	{
		return brep.save(b);
	}
	public List<Bill> getall()
	{
		return brep.findAll();
	}

}
