package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Exception.Crime_InfoExcetion;
import com.Exception.Criminal_InfoExcetion;
import com.Utility.DBUtil;
import com.bean.Crime_Info;
import com.bean.Criminal_Info;
import com.mysql.cj.protocol.Resultset;


public class CrimeDAOImp implements CrimeDAO{

	
	@Override
	public String AddCrime(Crime_Info crimeInfo) {
		
		String msg= "Not Insertd ....";
		
		

		try(Connection conn= DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement
					("insert into criminfo (cdate, cplace, Crime_name, Victims, Description_crime, suspected_name)"
												+ "values (?,?,?,?,?,?)");
			
			ps.setString(1,crimeInfo.getCdate());
			ps.setString(2, crimeInfo.getCplace());
			ps.setString(3,crimeInfo.getCrime());
			ps.setString(4,crimeInfo.getVictims());
			ps.setString(5,crimeInfo.getDescription_Crime());
			ps.setString(6,crimeInfo.getSuspected_name());
			
			
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				msg="Crime Added Sucessfully !";
			}
		} catch (SQLException e) {
		
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		return msg;
	}

	@Override
	public List<Crime_Info> ViewCrime() throws Crime_InfoExcetion {
		List<Crime_Info> Crime= new ArrayList<>();


		try(Connection conn= DBUtil.provideConnection();) {
		
			PreparedStatement ps = conn.prepareStatement ("select * from criminfo");
			
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
			
				int id= rs.getInt("crimId");
				String n= rs.getString("cdate");
				String a= rs.getString("cplace");
				String g= rs.getString("Crime_name");
				String ad= rs.getString("Victims");
				String fm= rs.getString("Description_Crime");
				String  area= rs.getString("suspected_name");
				String crn= rs.getString("case_Status");
				
				
			Crime_Info cri=new Crime_Info(id, n, a, g, ad, fm, area, crn);
			
	    Crime.add(cri);
	
			}
			} catch (SQLException e) {
				throw new Crime_InfoExcetion(e.getMessage());
				
			}
			
			
			if(Crime.size() == 0)
				throw new Crime_InfoExcetion("No crime found..");
		
			
			return Crime;
	
	}

	@Override
	public int statuscount(String s1) throws Crime_InfoExcetion {
		
		int count=0;
		
			
			try (Connection conn= DBUtil.provideConnection();){
				PreparedStatement ps = conn.prepareStatement ("select count(*) from criminfo where case_status=?");
					ps.setString(1,s1);
				ResultSet rs= ps.executeQuery();
				if(rs.next()) {
					
					count= rs.getInt("count(*)");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return count;
	}

	@Override
	public int Monthcount(String s1, String s2) throws Crime_InfoExcetion {
		int count=0;
		
		
		try (Connection conn= DBUtil.provideConnection();){
			PreparedStatement ps = conn.prepareStatement ("select count(*) from criminfo where cdate between ? AND ?");
				ps.setString(1,s1);
				ps.setString(2, s2);
		
				
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				count= rs.getInt("count(*)");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return count;
	}

	@Override
	public List<Crime_Info>CrimeArea(String n) throws Crime_InfoExcetion {
		
		List<Crime_Info> Crime= new ArrayList<>();
		
		try (Connection conn= DBUtil.provideConnection();){
			PreparedStatement ps = conn.prepareStatement ("select * from criminfo where cplace=?");
			
	          ps.setString(1, n);
				
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int id= rs.getInt("crimId");
				String d= rs.getString("cdate");
				String a= rs.getString("cplace");
				String g= rs.getString("Crime_name");
				String ad= rs.getString("Victims");
				String fm= rs.getString("Description_Crime");
				String  area= rs.getString("suspected_name");
				String crn= rs.getString("case_Status");
				
				
			Crime_Info cri=new Crime_Info(id, d, a, g, ad, fm, area, crn);
		    Crime.add(cri);
	    
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		if(Crime.size() == 0)
			throw new Crime_InfoExcetion("No crime found..");
	
		
		return Crime;

	}
	
	@Override
	public String UpdateCrime(Crime_Info crimeInfo) {
		
		String msg="Not Updated....";
		
		try(Connection conn= DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("update criminfo set case_status=? where crimId=?");
				
			
			ps.setString(1, crimeInfo.getCase_Status());
			ps.setInt(2, crimeInfo.getCrimeId());
			ps.executeUpdate();
			
		
				
				msg="Case Status Updated Successfully";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}
	

	
	}
	
	

	


