package com.example.MobilePhone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MobilePhone.db.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {
	 Login findByuname(String uname); 

}
