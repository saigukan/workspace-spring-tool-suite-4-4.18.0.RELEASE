package com.example.springdemo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.db.database;
@Repository

public interface finish extends JpaRepository <database,Integer>
{

}
