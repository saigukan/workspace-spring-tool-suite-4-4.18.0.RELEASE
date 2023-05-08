package com.example.MobilePhone.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.MobilePhone.db.MobilePhone;

@Repository
public interface PhoneRepository extends JpaRepository<MobilePhone,Integer>{
	@Query("select p from MobilePhone p where p.ram=?1")
	public List<MobilePhone> getPhoneByRam(String ram);
	@Query("select p from MobilePhone p where p.ram=?1 and p.name=?2")
	public List<MobilePhone> getPhoneByRam(String ram,String name);
	@Modifying
	@Query("delete from MobilePhone p where p.name=?1" )
	public int deletephonebyname(String name);
	@Modifying
	@Query("update MobilePhone p set p.ram=?1 where p.name=?2" )
	public int updatephonebyname(String ram,String name);
	
	List<MobilePhone> findByNameStartingWith(String prefix);

	List<MobilePhone> findByNameEndingWith(String suffix);

	List<MobilePhone> findByColour(String colour);

}
