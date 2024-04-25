package com.Web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Web.Repo.CustmorRepo;
import com.Web.model.Custmer;
@Service
public class CustmerServiceimp implements CustmerService{
	@Autowired
	private CustmorRepo custmorRepo;

	@Override
	public Custmer saverecord(Custmer custmer) {
		Custmer cust=custmorRepo.save(custmer);
		return cust;
	}

	@Override
	public Custmer updateRecord(Custmer custmer, int cid) {
		Custmer oldrecord=custmorRepo.findById(cid).get();
		oldrecord.setAddress(custmer.getAddress());
		oldrecord.setCity(custmer.getCity());
		oldrecord.setEmail(custmer.getEmail());
		oldrecord.setFirstname(custmer.getFirstname());
		oldrecord.setLastname(custmer.getLastname());
		oldrecord.setPhone(custmer.getPhone());
		oldrecord.setState(custmer.getState());
		oldrecord.setStreet(custmer.getStreet());
		Custmer c=custmorRepo.save(oldrecord);
		return c;
	}

	@Override
	public void deleteRecord(int cid) {
		custmorRepo.deleteById(cid);
		
	}

	@Override
	public Custmer getOneRecord(int cid) {
        Custmer get=custmorRepo.findById(cid).get();
		return get;
	}

	

}
