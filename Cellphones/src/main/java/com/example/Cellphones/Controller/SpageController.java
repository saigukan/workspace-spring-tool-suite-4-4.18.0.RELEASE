package com.example.Cellphones.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cellphones.Service.SpageService;
import com.example.Cellphones.db.Spage;

@RestController
@CrossOrigin 
public class SpageController {
	@Autowired
	SpageService serv;
	 @PostMapping("/loginss")
     public String login(@RequestBody Map<String,String> loginData)
     {
   	 String username = loginData.get("username");
   	 String password = loginData.get("password");
   	 String result = serv.checkLogin(username,password);
   	 return result;
     }
	@GetMapping("/sget")
	public List<Spage>getval()
	{
		return serv.getval();
	}
	@PostMapping("/spost")
	public Spage podtval(@RequestBody Spage s)
	{
		return serv.postval(s);
	}
	

}
