package com.Usecases;

import java.util.Scanner;

import com.DAO.CrimeDAO;
import com.DAO.CrimeDAOImp;
import com.bean.Crime_Info;


public class CaseStatusUpdateUsecase {

	public static void UpdateCaseStatus() {
    Scanner sc=new Scanner(System.in);
		
		System.out.println("Update Case Status: ");
		String Status=sc.next();
		
		System.out.println("Enter the crimId: ");
		int id=sc.nextInt();
		
		CrimeDAO dao=new CrimeDAOImp();

		Crime_Info crime=new Crime_Info();
		
		
		crime.setCase_Status(Status);;
		crime.setCrimeId(id);;
		
      String result= dao.UpdateCrime(crime);
		
		System.out.println(result);
	}
}
