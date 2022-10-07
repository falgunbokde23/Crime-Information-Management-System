package com.DAO;


import java.util.List;

import com.Exception.Criminal_InfoExcetion;
import com.bean.Criminal_Info;

public interface CriminalDAo {

	public String AddCriminal(Criminal_Info criminalInfo);
    
	public List<Criminal_Info> ViewCriminal() throws Criminal_InfoExcetion;
	
	public Criminal_Info getcriminalByCId(int Cid) throws   Criminal_InfoExcetion;
	
	public String UpdateCriminal(Criminal_Info criminalInfo);
	
	
	
	
	
}
