package com.example.Cellphones.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cellphones.Repository.SpageRepository;
import com.example.Cellphones.db.Spage;


@Service
public class SpageService {
	@Autowired
	SpageRepository repo;
	public String checkLogin(String username, String password) {
        Spage user = repo.findByusername(username);
        if (user == null) {
            return "No User Found\nPlease Try Again!!!!";
        } else {
            // Check if the usernames match in a case-sensitive manner
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    return "Login Successful";
                } else {
                    return "Login Failed";
                }
            } else {
                return "Login Failed";
            }
        }
    }
	public List<Spage>getval()
	{
		return repo.findAll();
	}
	public Spage postval(Spage s)
	{
		return repo.save(s);
	}

}
