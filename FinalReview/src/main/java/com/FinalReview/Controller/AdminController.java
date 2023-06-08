package com.FinalReview.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FinalReview.Model.LoanApplicationModel;
import com.FinalReview.Service.AdminService;

@RestController
public class AdminController 
{
  @Autowired
  AdminService aService;
  @GetMapping("/AdminDetails")
  public List<LoanApplicationModel> getAdmin()
  {
	  List<LoanApplicationModel> adminList = aService.getAdmin();
 	   return adminList;
  }
  @PostMapping("/addUser")
  public LoanApplicationModel saveDetails(@RequestBody LoanApplicationModel lm)
  {
	  return aService.saveDeatils(lm);
  }
  
}