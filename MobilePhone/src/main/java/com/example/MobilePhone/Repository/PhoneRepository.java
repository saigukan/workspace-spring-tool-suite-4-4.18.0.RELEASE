package com.example.MobilePhone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MobilePhone.db.MobilePhone;
@Repository
public interface PhoneRepository extends JpaRepository<MobilePhone,Integer>{
	List<MobilePhone> findByNameStartingWith(String prefix);

	List<MobilePhone> findByNameEndingWith(String suffix);

	List<MobilePhone> findByColour(String colour);

}
