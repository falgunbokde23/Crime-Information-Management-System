package com.DAO;

import java.util.List;

import com.Exception.Criminal_InfoExcetion;
import com.bean.Crime_Info;
import com.bean.Criminal_Crime_Info;
import com.bean.Criminal_Info;

public interface Criminal_crimeDAO {

	public List<Criminal_Info>  CrimeFile(String cname)  throws Criminal_InfoExcetion;
	public String AddCriminalCrime(int crimeid, int cid);
	public String DeleteCriminal_crime(Criminal_Crime_Info crimeInfo);
}
