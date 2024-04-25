package com.Web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Web.model.Custmer;
import com.Web.service.CustmerService;

@RestController
@CrossOrigin(origins = {"*"} )
public class Controller {
	
	@Autowired
	private CustmerService custmerService;
	
	@PostMapping("/save")
	public String savedata(@RequestBody Custmer custmer) {
		Custmer e1=custmerService.saverecord(custmer);
		 String message=null;
			if(e1!=null)	
			{
				message="Data Saved Successfully";
			}
			else
			{
				message="Data Failed";
			}
			return message;
	
		
	}
	@GetMapping("/get/{cid}")
	public Custmer getone(@PathVariable int cid) {
		Custmer c=custmerService.getOneRecord(cid); 
		
		return c;
	}
	@DeleteMapping("/delete/{cid}")
	public void delerecord(@PathVariable int cid) {
		custmerService.deleteRecord(cid);

	}
	@PutMapping("/update/{cid}")
	public Custmer updaterecord(@PathVariable int cid,@RequestBody Custmer custmer) {
		Custmer upd=custmerService.updateRecord(custmer, cid);
		return upd;
	}
	

			
}
