package com.example.MobilePhone.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MobilePhone.Repository.RegisterRepository;
import com.example.MobilePhone.db.Register;



@Service
public class RegisterService {
	 @Autowired
	    RegisterRepository usrRegistrationRepository;
		public Register saveRegistration(Register r) 
		{
			return usrRegistrationRepository.save(r);
		}
		public List<Register> getAllUsers() 
		{
			 List<Register> petList = usrRegistrationRepository.findAll();
		      return petList;
		}
	
	}