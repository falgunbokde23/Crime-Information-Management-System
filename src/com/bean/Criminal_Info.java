package com.bean;

public class Criminal_Info {

private int Cid;
private	String  Name;
private int Age;
private String Gender;
private String Address;
private String Identify_face_mark;
private String Crime_Area;
private String Crime_Name;


public Criminal_Info() {
	
}


public Criminal_Info(int cid, String name, int age, String gender, String address, String identify_face_mark,
		String crime_Area, String crime_Name) {
	super();
	Cid = cid;
	Name = name;
	Age = age;
	Gender = gender;
	Address = address;
	Identify_face_mark = identify_face_mark;
	Crime_Area = crime_Area;
	Crime_Name = crime_Name;
}


public int getCid() {
	return Cid;
}


public void setCid(int cid) {
	Cid = cid;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public int getAge() {
	return Age;
}


public void setAge(int age) {
	Age = age;
}


public String getGender() {
	return Gender;
}


public void setGender(String gender) {
	Gender = gender;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public String getIdentify_face_mark() {
	return Identify_face_mark;
}


public void setIdentify_face_mark(String identify_face_mark) {
	Identify_face_mark = identify_face_mark;
}


public String getCrime_Area() {
	return Crime_Area;
}


public void setCrime_Area(String crime_Area) {
	Crime_Area = crime_Area;
}


public String getCrime_Name() {
	return Crime_Name;
}


public void setCrime_Name(String crime_Name) {
	Crime_Name = crime_Name;
}


@Override
public String toString() {
	return "Criminal_Info [Cid=" + Cid + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Address="
			+ Address + ", Identify_face_mark=" + Identify_face_mark + ", Crime_Area=" + Crime_Area + ", Crime_Name="
			+ Crime_Name + "]";
}


}




