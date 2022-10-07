package com.bean;

public class Criminal_Crime_Info {

	private int CrimeId;
	private int CriminalId;
	
	
	public Criminal_Crime_Info() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Criminal_Crime_Info(int crimeId, int criminalId) {
		super();
		CrimeId = crimeId;
		CriminalId = criminalId;
	}


	public int getCrimeId() {
		return CrimeId;
	}


	public void setCrimeId(int crimeId) {
		CrimeId = crimeId;
	}


	public int getCriminalId() {
		return CriminalId;
	}


	public void setCriminalId(int criminalId) {
		CriminalId = criminalId;
	}


	@Override
	public String toString() {
		return "Criminal_Crime_Info [CrimeId=" + CrimeId + ", CriminalId=" + CriminalId + "]";
	}
	
	
}
