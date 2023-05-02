package com.example.MobilePhone.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MobilePhone.Service.LoginService;
import com.example.MobilePhone.db.Login;

@RestController
public class LoginController {
	@Autowired
    LoginService uService;
    @PostMapping("/login")
     public String login(@RequestBody Map<String,String> loginData)
     {
   	 String uname = loginData.get("uname");
   	 String password = loginData.get("password");
   	 String result = uService.checkLogin(uname,password);
   	 return result;
     }
      @PostMapping("/adduser")
      public Login AddUser(@RequestBody Login u)
      {
   	   return uService.addUser(u);
      }
      @GetMapping("/add")
      public List<Login> listAll()
      {
   	   return uService.getUser();
   	 
      }
      @PutMapping(value="/put/{id}")
      public Login updateUser(@RequestBody Login us,@PathVariable int id)
      {
   	   return uService.updateUser(us,id);
      }
    
}


