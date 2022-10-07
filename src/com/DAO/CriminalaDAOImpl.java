package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Exception.Criminal_InfoExcetion;
import com.Utility.DBUtil;
import com.bean.Crime_Info;
import com.bean.Criminal_Info;

public class CriminalaDAOImpl  implements CriminalDAo {

	@Override
	public String AddCriminal(Criminal_Info criminalInfo) {

		String msg= "Not Insertd ....";
		
	
		
		try(Connection conn= DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement
					("insert into criminal (Cname, Age, Gender, Address, Face_mark, Crime_Area, Crime_Name) "
							+ "values (?,?,?,?,?,?,?)");
			
			ps.setString(1,criminalInfo.getName());
			ps.setInt(2, criminalInfo.getAge());
			ps.setString(3,criminalInfo.getGender());
			ps.setString(4,criminalInfo.getAddress());
			ps.setString(5,criminalInfo.getIdentify_face_mark());
			ps.setString(6,criminalInfo.getCrime_Area());
			ps.setString(7,criminalInfo.getCrime_Name());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				msg="Criminal Added Sucessfully !";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public List<Criminal_Info> ViewCriminal() throws Criminal_InfoExcetion {
		List<Criminal_Info> Criminals= new ArrayList<>();


		try(Connection conn= DBUtil.provideConnection();) {
		
			PreparedStatement ps = conn.prepareStatement ("select * from criminal");
			
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
			
				int id= rs.getInt("CId");
				String n= rs.getString("Cname");
				int a= rs.getInt("Age");
				String g= rs.getString("Gender");
				String ad= rs.getString("Address");
				String fm= rs.getString("Face_mark");
				String  area= rs.getString("Crime_Area");
				String crn= rs.getString("Crime_Name");
				
				
			Criminal_Info cri=new Criminal_Info(id, n, a, g, ad, fm, area, crn);
			
	    Criminals.add(cri);
	
			}
			} catch (SQLException e) {
				throw new Criminal_InfoExcetion(e.getMessage());
				
			}
			
			
			if(Criminals.size() == 0)
				throw new Criminal_InfoExcetion("No Criminal found..");
			
			
			
			
			return Criminals;
	
	}

	@Override
	public Criminal_Info getcriminalByCId(int Cid) throws Criminal_InfoExcetion {
		
		Criminal_Info criminal=null;
		
try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from criminal where Cid=?");
			
			
			ps.setInt(1, Cid);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int id= rs.getInt("CId");
				String n= rs.getString("Cname");
				int a= rs.getInt("Age");
				String g= rs.getString("Gender");
				String ad= rs.getString("Address");
				String fm= rs.getString("Face_mark");
				String  area= rs.getString("Crime_Area");
				String crn= rs.getString("Crime_Name");
				
				
			criminal=new Criminal_Info(id, n, a, g, ad, fm, area, crn);	
				
				
			}else
				throw new Criminal_InfoExcetion("Criminal does not exist with ID "+Cid);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			throw new Criminal_InfoExcetion(e.getMessage());
			
			
		}
	
		return criminal;
	}

	@Override
	public String UpdateCriminal(Criminal_Info criminalInfo) {
		
		String msg="Not Updated....";
		
		try(Connection conn= DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("update criminal set Cname=? where Cid=?");
			
			ps.setString(1, criminalInfo.getName());
			ps.setInt(2, criminalInfo.getCid());
			ps.executeUpdate();
			
		
				
				msg="Table Updated Successfully";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}



		
}
