package com.example.MobilePhone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.MobilePhone.Repository.PhoneRepository;
import com.example.MobilePhone.db.MobilePhone;

import jakarta.transaction.Transactional;



@Service
public class PhoneService {
	@Autowired
	PhoneRepository prep;
	public List<MobilePhone> getphone()
	{
		List<MobilePhone> a=prep.findAll();
		return a;
	}
	public MobilePhone savephone(MobilePhone m)
	{
		MobilePhone obj=prep.save(m);
		return obj;
	}
	public MobilePhone upphone(MobilePhone m,int no)
	{
		Optional<MobilePhone> optional=prep.findById(no);
		MobilePhone obj=null;
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
	public List<MobilePhone> sortphone(String name)

	{

		return prep.findAll(Sort.by(name).descending());

	}

	public List<MobilePhone> paginate(int num, int size) 

	{

		Page<MobilePhone> p=prep.findAll(PageRequest.of(num, size));

		return p.getContent();

	}

	public List<MobilePhone> paginate(int num, int size, String name) 

	{

		Page<MobilePhone> obj=prep.findAll(PageRequest.of(num, size,Sort.by(name)));

		return obj.getContent();

	}

	public List<MobilePhone> fetchPhoneByNamePrefix(String prefix)

	{

		return prep.findByNameStartingWith(prefix);

	}

	public List<MobilePhone> fetchPhoneByNameSuffix(String suffix)

	{

		return prep.findByNameEndingWith(suffix);

	}

	public List<MobilePhone> fetchPhoneByColour(String colour)

	{

		return prep.findByColour(colour);

	}
	public List<MobilePhone> getPhoneByRam(String ram)
	{
		return prep.getPhoneByRam(ram);
		

	}
	public List<MobilePhone> getPhoneByRam(String ram,String name)
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
