package com.example.Cellphones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Cellphones.db.Bill;
@Repository
public interface BillRepository  extends JpaRepository<Bill, Integer> {

}
