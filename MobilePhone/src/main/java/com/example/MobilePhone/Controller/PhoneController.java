package com.example.MobilePhone.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MobilePhone.Service.PhoneService;
import com.example.MobilePhone.db.MobilePhone;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PhoneController {
	@Autowired
	PhoneService pserv;
	@Tag(name="Get all MobilePhone",description="Get all")
	@GetMapping(value="/get")
	public List<MobilePhone> getphone()
	{
		List<MobilePhone> a=pserv.getphone();
		return a;
	}
	@PostMapping(value="/post")
	public MobilePhone savephone(@RequestBody MobilePhone m)
	{
		return pserv.savephone(m);
	}
	@PutMapping(value="/put/{no}")
	public MobilePhone upphone(@RequestBody MobilePhone m,@PathVariable int no)
	{
		return pserv.upphone(m,no);
	}
	@DeleteMapping(value="/delete/{no}")
	public void deletephone(@PathVariable ("no") int no)
	{
		pserv.deletephone(no);
	}
	@GetMapping("/sort/{name}")

    public List<MobilePhone> sortphone(@PathVariable("name") String name)

    {

    	return pserv.sortphone(name);

    }

    @GetMapping("pagination/{nm}/{sp}")

	public List<MobilePhone> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)

	{

		return pserv.paginate(num,size);

	}

	@GetMapping("pagination/{nm}/{sp}/{inr}")

	public List<MobilePhone> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)

	{

		return pserv.paginate(num,size,name);

	}

	@GetMapping("/fetchPrefix")

	public List<MobilePhone> fetchPhoneByNamePrefix(@RequestParam String prefix)

	{

		return pserv.fetchPhoneByNamePrefix(prefix);

	}

	@GetMapping("/fetchSuffix")

	public List<MobilePhone> fetchPhoneByNameSuffix(@RequestParam String suffix)

	{

		return pserv.fetchPhoneByNameSuffix(suffix);

	}

	@GetMapping("/fetchColour")

	public List<MobilePhone> fetchPhoneByColour(@RequestParam String colour)

	{

		return pserv.fetchPhoneByColour(colour);

	}
	@GetMapping(value="/jpl/{ram}")
	public List<MobilePhone> getPhoneByRam(@PathVariable String ram)
	{
		return pserv.getPhoneByRam(ram);
		
	}
	@GetMapping(value="/jpl/{ram}/{name}")
	public List<MobilePhone> getPhoneByRam(@PathVariable String ram,@PathVariable String name )
	{
		return pserv.getPhoneByRam(ram,name);
		
	}
	@DeleteMapping(value="del/{no}")
	public String deletephonebyname(@PathVariable String name)
	{
		int result = pserv.deletephonebyname(name);
		if(result>0)
			return "Student record deleted";
		else
			return "Problem ocuured while deleting";
	}
	@PutMapping(value="/update/{ram}/{name}")
	public int updatephonebyname(@PathVariable String ram,@PathVariable String name)
	{
		return pserv.updatephonebyname(ram,name);
	}
	

}
