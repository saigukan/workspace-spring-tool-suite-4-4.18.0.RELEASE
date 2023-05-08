package com.example.MobilePhone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MobilePhone.db.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register,String>
{
      
}