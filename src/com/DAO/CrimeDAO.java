package com.DAO;

import java.util.List;

import com.Exception.Crime_InfoExcetion;

import com.bean.Crime_Info;
import com.bean.Criminal_Info;


public interface CrimeDAO {

	public String AddCrime(Crime_Info crimeInfo);
	public List<Crime_Info> ViewCrime() throws Crime_InfoExcetion;
	public int statuscount(String s1)throws Crime_InfoExcetion;
	public int Monthcount(String s1, String s2)throws Crime_InfoExcetion; 
	public List<Crime_Info> CrimeArea(String s) throws Crime_InfoExcetion;
	public String UpdateCrime(Crime_Info crimeInfo);

	
	
}
