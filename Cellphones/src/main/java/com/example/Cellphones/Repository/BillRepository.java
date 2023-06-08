package com.example.Cellphones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Cellphones.db.Bill;

public interface BillRepository  extends JpaRepository<Bill, Integer> {

}
