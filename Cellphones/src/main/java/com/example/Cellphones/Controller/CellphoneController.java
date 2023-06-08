package com.example.Cellphones.Controller;

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

import com.example.Cellphones.Service.CellphoneService;
import com.example.Cellphones.db.Cellphone;
@RestController
public class CellphoneController {
	@Autowired
	CellphoneService pserv;
	@GetMapping(value="/geet")
	public List<Cellphone> getphone()
	{
		List<Cellphone> a=pserv.getphone();
		return a;
	}
	@PostMapping(value="/posst")
	public Cellphone savephone(@RequestBody Cellphone m)
	{
		return pserv.savephone(m);
	}
	@PutMapping(value="/puth/{no}")
	public Cellphone upphone(@RequestBody Cellphone m,@PathVariable int no)
	{
		return pserv.upphone(m,no);
	}
	@DeleteMapping(value="/deletee/{no}")
	public void deletephone(@PathVariable ("no") int no)
	{
		pserv.deletephone(no);
	}
	@GetMapping("/sorrt/{name}")

    public List<Cellphone> sortphone(@PathVariable("name") String name)

    {

    	return pserv.sortphone(name);

    }

    @GetMapping("Pagination/{nm}/{sp}")

	public List<Cellphone> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)

	{

		return pserv.paginate(num,size);

	}

	@GetMapping("Pagination/{nm}/{sp}/{inr}")

	public List<Cellphone> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)

	{

		return pserv.paginate(num,size,name);

	}

	@GetMapping("/fetchprefix")

	public List<Cellphone> fetchPhoneByNamePrefix(@RequestParam String prefix)

	{

		return pserv.fetchPhoneByNamePrefix(prefix);

	}

	@GetMapping("/fetchsuffix")

	public List<Cellphone> fetchPhoneByNameSuffix(@RequestParam String suffix)

	{

		return pserv.fetchPhoneByNameSuffix(suffix);

	}

	@GetMapping("/fetchColor")

	public List<Cellphone> fetchPhoneByColour(@RequestParam String colour)

	{

		return pserv.fetchPhoneByColour(colour);

	}
	@GetMapping(value="/jppl/{ram}")
	public List<Cellphone> getPhoneByRam(@PathVariable String ram)
	{
		return pserv.getPhoneByRam(ram);
		
	}
	@GetMapping(value="/jpll/{ram}/{name}")
	public List<Cellphone> getPhoneByRam(@PathVariable String ram,@PathVariable String name )
	{
		return pserv.getPhoneByRam(ram,name);
		
	}
	@DeleteMapping(value="dell/{no}")
	public String deletephonebyname(@PathVariable String name)
	{
		int result = pserv.deletephonebyname(name);
		if(result>0)
			return "Student record deleted";
		else
			return "Problem ocuured while deleting";
	}
	@PutMapping(value="/updatee/{ram}/{name}")
	public int updatephonebyname(@PathVariable String ram,@PathVariable String name)
	{
		return pserv.updatephonebyname(ram,name);
	}
	


}
