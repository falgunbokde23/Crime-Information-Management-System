package com.Usecases;

import java.util.List;

import com.DAO.CrimeDAO;
import com.DAO.CrimeDAOImp;

import com.Exception.Crime_InfoExcetion;

import com.bean.Crime_Info;


public class GetCrimeUsecase {
	

public static void ViewCrimeRecord() {
		
		CrimeDAO dao = new CrimeDAOImp();
		
		try {
		List<Crime_Info> criminals= dao.ViewCrime();
		
		criminals.forEach(s ->{
			
			System.out.println("Crime Id :"+s.getCrimeId());
			System.out.println("Crime Date : "+s.getCdate());
			System.out.println("Crime Place: "+s.getCplace());
			System.out.println("Crime Name: "+s.getCrime());
			System.out.println("Crime Victims: "+s.getVictims());
			System.out.println("Crime Description: "+s.getDescription_Crime());
			System.out.println("Crime Suspected name : "+s.getSuspected_name());
			System.out.println("Crime Case Status: "+s.getCase_Status());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		}catch(Crime_InfoExcetion se) {
			System.out.println(se.getMessage());
		}
		
		
		
		
		
	}
}
