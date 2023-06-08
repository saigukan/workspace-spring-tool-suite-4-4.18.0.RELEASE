package com.example.Cellphones.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cellphones.Service.LpageService;
import com.example.Cellphones.db.Lpage;
@RestController
@CrossOrigin
public class LpageController {
	@Autowired
	LpageService uService;
	@PostMapping("/adduser")
    public Lpage AddUser(@RequestBody Lpage u)
    {
 	   return uService.addUser(u);
    }
    @GetMapping("/add")
    public List<Lpage> listAll()
    {
 	   return uService.getUser();
 	 
    }

}
