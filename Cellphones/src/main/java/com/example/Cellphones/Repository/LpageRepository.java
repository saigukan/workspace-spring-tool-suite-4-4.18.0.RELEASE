package com.example.Cellphones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Cellphones.db.Lpage;

@Repository
public interface LpageRepository extends JpaRepository<Lpage,Integer>{
	


}
