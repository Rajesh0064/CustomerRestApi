package com.Web.service;

import com.Web.model.Custmer;


public interface CustmerService {
	public Custmer saverecord(Custmer custmer);
	public Custmer updateRecord(Custmer custmer,int cid);
	public void deleteRecord(int cid);
	public Custmer getOneRecord(int cid);

	

}
