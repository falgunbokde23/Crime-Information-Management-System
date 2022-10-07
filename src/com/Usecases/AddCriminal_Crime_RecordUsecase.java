package com.Usecases;

import java.util.Scanner;

import com.DAO.Criminal_crimeDAO;
import com.DAO.Criminal_crimeDAOImol;

public class AddCriminal_Crime_RecordUsecase {

	public static void AddCriminalCrime(){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Crime Id: ");
		int crimeid=sc.nextInt();
		
		System.out.println("Enter Criminal Id: ");
		int cid=sc.nextInt();
		
		
		Criminal_crimeDAO dao=new Criminal_crimeDAOImol();
		
		String res=dao.AddCriminalCrime(crimeid, cid);
		 System.out.println(res);
		
	}
	
	
}
