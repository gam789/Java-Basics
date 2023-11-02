package com.practice.javaoops;

class SchoolDetails{
	static String department = "English";
	
	final String instituteName = "Luminar";
}

public class StaticFinal {
	
	
	
	public static void main(String[] args) {
		/*System.out.println(SchoolDetails.department);
		System.out.println(SchoolDetails.department = "Malayalam");
		System.out.println(SchoolDetails.department);*/
		
		
		SchoolDetails s = new SchoolDetails();
		System.out.println(s.instituteName);
		
		//s.instituteName = "Alpha";  VALUE CANNOT BE CHANGED WHEN FINAL KEYWORD IS USED
	}

}
