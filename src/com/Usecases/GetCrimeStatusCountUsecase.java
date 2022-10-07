package com.Usecases;

import java.util.Scanner;

import com.DAO.CrimeDAO;
import com.DAO.CrimeDAOImp;
import com.Exception.Crime_InfoExcetion;

public class GetCrimeStatusCountUsecase {

	public static void countSovingCases() {
		CrimeDAO dao = new CrimeDAOImp();
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of Case status");
		String s1=sc.next();
		
		try {
		int c=dao.statuscount(s1);
		System.out.println("Total Number of soved/Unsolved Cases : "+c);	
			
		} catch (Crime_InfoExcetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
          
	
}
