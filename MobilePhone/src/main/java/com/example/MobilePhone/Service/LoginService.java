package com.example.MobilePhone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MobilePhone.Repository.LoginRepository;
import com.example.MobilePhone.db.Login;

@Service
public class LoginService {
	@Autowired
    LoginRepository userRep;
	public String checkLogin(String uname, String password) 
	{
		Login u = userRep.findByuname(uname) ;
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	
	public Login addUser(Login m)
	{
		return userRep.save(m) ;
	}
	
	public List<Login> getUser()
	{
		return userRep.findAll() ;
	}
	public Login updateUser(Login us,int id)
	{
		Optional<Login> optional = userRep.findById(id);
		Login obj = null;
		if(optional.isPresent())
		{
			 obj = optional.get();
			 userRep.save(us);
		}
		return obj;
	}

}
