package com.coding.ninja.student.util;

public class Student {
	private String rollNo;
	private String fName;
	private String lName;
	private String email;
	
	public Student(String rollNo, String fName, String lName, String email) {
		super();
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
