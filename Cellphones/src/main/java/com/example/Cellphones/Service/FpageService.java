package com.example.Cellphones.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cellphones.Repository.FpageRepository;
import com.example.Cellphones.db.Fpage;

@Service
public class FpageService {
	@Autowired
	FpageRepository frep;
	public Fpage forget(Fpage f)
	{
		 return frep.save(f);
	}

}
