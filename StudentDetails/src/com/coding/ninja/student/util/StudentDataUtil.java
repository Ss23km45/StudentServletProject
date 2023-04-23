package com.coding.ninja.student.util;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	private static List<Student> students = new ArrayList<Student>();
	
	public static void addStudent(String fname, String lname, String email, String rollNo) {
		try {
			
			students.add(new Student(rollNo, fname,lname, email ));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<Student> getStundents(){
		
		students.add(new Student("1", "Vinayakudu" ,"Siva", "lordganesh@gmail.com" ));
		students.add(new Student("2", "Sivudu" ,"Siva", "lordsiva@gmail.com" ));
		students.add(new Student("3", "Parvathi" ,"Siva", "lordparvathi@gmail.com" ));
		students.add(new Student("4", "Kumarswami" ,"Siva", "lordkamar@gmail.com" ));
		return students;
	}
	
	
}
