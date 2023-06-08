package com.example.Cellphones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Cellphones.db.Spage;

@Repository
public interface SpageRepository extends JpaRepository<Spage,String> {
	 Spage findByusername(String username);

}
