package com.Usecases;

import java.util.Scanner;

import com.DAO.CriminalDAo;
import com.DAO.CriminalaDAOImpl;
import com.Exception.Criminal_InfoExcetion;
import com.bean.Criminal_Info;

public class GetCriminalByCidUsecase {

	
	public static void ViewCriminalById() {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the Criminal Id");
		int id=sc.nextInt();
		
		CriminalDAo dao=new CriminalaDAOImpl();
		
		try {
			Criminal_Info criminal=dao.getcriminalByCId(id);
			
			
				System.out.println("Criminal Id :"+criminal.getCid());
				System.out.println("Criminal name: "+criminal.getName());
				System.out.println("Criminal Age: "+criminal.getAge());
				System.out.println("Criminal Gender: "+criminal.getGender());
				System.out.println("Criminal Address: "+criminal.getAddress());
				System.out.println("Criminal Face Mark: "+criminal.getIdentify_face_mark());
				System.out.println("Criminal Crime Area: "+criminal.getCrime_Area());
				System.out.println("Criminal Crime Name: "+criminal.getCrime_Name());
				
			System.out.println();
			
			System.out.println();
		
		} catch (Criminal_InfoExcetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
