package com.example.Cellphones.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cellphones.Repository.LpageRepository;
import com.example.Cellphones.db.Lpage;

@Service
public class LpageService {
	@Autowired
	LpageRepository userRep;
	public Lpage addUser(Lpage m)
	{
		return userRep.save(m) ;
	}
	
	public List<Lpage> getUser()
	{
		return userRep.findAll() ;
	}

}
