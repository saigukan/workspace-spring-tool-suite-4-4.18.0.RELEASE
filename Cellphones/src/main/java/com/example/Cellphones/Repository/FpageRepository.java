package com.example.Cellphones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Cellphones.db.Fpage;

@Repository
public interface FpageRepository extends JpaRepository<Fpage,String> {
	

}
