package com.Usecases;

import java.util.Scanner;
import com.DAO.Criminal_crimeDAO;
import com.DAO.Criminal_crimeDAOImol;
import com.bean.Criminal_Crime_Info;

public class DeleteCriminal_CrimeUseCase {
	
	public static void DelectCrimeRecord() {
		
		
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Criminal id: ");
		int id=sc.nextInt();
		
		Criminal_crimeDAO dao=new Criminal_crimeDAOImol();

		Criminal_Crime_Info crime=new Criminal_Crime_Info();
	
		crime.setCrimeId(id);;
		
      String result= dao.DeleteCriminal_crime(crime);
		
		System.out.println(result);
		
		
	
	
}

}
