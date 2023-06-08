package com.example.Cellphones.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Cellphones.Repository.CellphoneRepository;
import com.example.Cellphones.db.Cellphone;

import jakarta.transaction.Transactional;
@Service

public class CellphoneService {
	@Autowired
	CellphoneRepository prep;
	public List<Cellphone> getphone()
	{
		List<Cellphone> a=prep.findAll();
		return a;
	}
	public Cellphone savephone(Cellphone m)
	{
		Cellphone obj=prep.save(m);
		return obj;
	}
	public Cellphone upphone(Cellphone m,int no)
	{
		Optional<Cellphone> optional=prep.findById(no);
		Cellphone obj=null;
		if(optional.isPresent() )
		{
			obj=optional.get();
			prep.save(m);
		}
		return obj;
	}
	public void deletephone(int no)
	{
		prep.deleteById(no);
	}
	public List<Cellphone> sortphone(String name)

	{

		return prep.findAll(Sort.by(name).ascending());

	}

	public List<Cellphone> paginate(int num, int size) 

	{

		Page<Cellphone> p=prep.findAll(PageRequest.of(num, size));

		return p.getContent();

	}

	public List<Cellphone> paginate(int num, int size, String name) 

	{

		Page<Cellphone> obj=prep.findAll(PageRequest.of(num, size,Sort.by(name)));

		return obj.getContent();

	}

	public List<Cellphone> fetchPhoneByNamePrefix(String prefix)

	{

		return prep.findByNameStartingWith(prefix);

	}

	public List<Cellphone> fetchPhoneByNameSuffix(String suffix)

	{

		return prep.findByNameEndingWith(suffix);

	}

	public List<Cellphone> fetchPhoneByColour(String colour)

	{

		return prep.findByColour(colour);

	}
	public List<Cellphone> getPhoneByRam(String ram)
	{
		return prep.getPhoneByRam(ram);
		

	}
	public List<Cellphone> getPhoneByRam(String ram,String name)
	{
		return prep.getPhoneByRam(ram,name);
		

	}
	@Transactional
	public int  deletephonebyname(String name)
	{
		return prep.deletephonebyname(name);
	}
	@Transactional
	public int updatephonebyname(String ram, String name)
	{
		return prep.updatephonebyname(ram,name);
	}


}
