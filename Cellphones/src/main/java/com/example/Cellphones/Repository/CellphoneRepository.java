package com.example.Cellphones.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.Cellphones.db.Cellphone;
@Repository
public interface CellphoneRepository extends JpaRepository<Cellphone,Integer> {
	@Query("select p from Cellphone p where p.ram=?1")
	public List<Cellphone> getPhoneByRam(String ram);
	@Query("select p from Cellphone p where p.ram=?1 and p.name=?2")
	public List<Cellphone> getPhoneByRam(String ram,String name);
	@Modifying
	@Query("delete from Cellphone p where p.name=?1" )
	public int deletephonebyname(String name);
	@Modifying
	@Query("update Cellphone p set p.ram=?1 where p.name=?2" )
	public int updatephonebyname(String ram,String name);
	
	List<Cellphone> findByNameStartingWith(String prefix);

	List<Cellphone> findByNameEndingWith(String suffix);

	List<Cellphone> findByColour(String colour);

}
