package com.example.MobilePhone.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MobilePhone.Service.RegisterService;
import com.example.MobilePhone.db.Register;

@RestController
public class RegisterController {
	@Autowired
    RegisterService usrRegsitrationService;
    @PostMapping("/registereduser")
    public Register saveRegistration(@RequestBody Register r)
    {
  	  return usrRegsitrationService.saveRegistration(r);
    }
    @GetMapping("/fetchalldata")
    public List<Register> getAllUsers()
    {
   	 List<Register> petList = usrRegsitrationService.getAllUsers();
   	 return petList;
    }

}
