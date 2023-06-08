package com.example.Cellphones.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cellphones.Service.FpageService;
import com.example.Cellphones.db.Fpage;

@RestController 
@CrossOrigin
public class FpageController {
	@Autowired
	FpageService fserv;
	@PostMapping("/fpost")
	public Fpage forget(@RequestBody Fpage f )
	{
		return fserv.forget(f);
	}

}
