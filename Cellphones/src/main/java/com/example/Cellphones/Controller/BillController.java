package com.example.Cellphones.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cellphones.Service.BillService;
import com.example.Cellphones.db.Bill;
@RestController
@CrossOrigin
public class BillController {
	@Autowired
	BillService bser;
	@PostMapping("/generatebill")
	public Bill add(@RequestBody Bill b)
	{
		return bser.add(b);
	}
	@GetMapping("/getbill")
	public List<Bill> getall()
	{
		return bser.getall();
	}

}
