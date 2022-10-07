package com.Usecases;

import java.util.Scanner;

import com.DAO.CriminalDAo;
import com.DAO.CriminalaDAOImpl;
import com.bean.Criminal_Info;

public class AddCriminalUseCase {

	
	public static void Addcriminal() {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Criminal Name: ");
		String name=sc.next();
		
		System.out.println("Enter Criminal Age: ");
		int age=sc.nextInt();
		
		
		System.out.println("Enter Criminal Gender: ");
		String gender=sc.next();
		
		System.out.println("Enter Criminal Address : ");
		String address=sc.next();
		
		System.out.println("Enter Criminal Face Mark: ");
		String mark=sc.next();
		
		System.out.println("Enter Criminal crime Area : ");
		String area=sc.next();
		
		System.out.println("Enter Criminal crime Name : ");
		String crime=sc.next();
		
		
		CriminalDAo dao=new CriminalaDAOImpl();

		Criminal_Info criminal=new Criminal_Info();
		
		
		criminal.setName(name);
		criminal.setAge(age);
		criminal.setGender(gender);
		criminal.setAddress(address);
		criminal.setIdentify_face_mark(mark);
		criminal.setCrime_Area(area);
		criminal.setCrime_Name(crime);
		
		
		String result= dao.AddCriminal(criminal);
		
		System.out.println(result);
		
	}
	
}
