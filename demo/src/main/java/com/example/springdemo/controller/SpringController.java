package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController
{
	
	@ResponseBody
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String good()
	{
		return "karthi";
	}
	@ResponseBody
	@GetMapping("/signup")
	public String god(@RequestParam String userbirth , @RequestParam String username)
	{
		if(userbirth.equals("10102003")&&username.equals("sai"))
		{
			return "Login succesful";
		}
		else
		{
			return "Login unsuccessfull";
		}
	
	}

}
