package com.FinalReview.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FinalReview.Model.LoanApplicationModel;
import com.FinalReview.Repository.LoanApplicationModelRepository;


@Service
public class AdminService 
{
    @Autowired
    LoanApplicationModelRepository loanApp;
    public List<LoanApplicationModel> getAdmin() 
	{
		
    	return loanApp.findAll();
	}
	public LoanApplicationModel saveDeatils(LoanApplicationModel lm) 
	{
		
		return loanApp.save(lm);
	}
	
    
}