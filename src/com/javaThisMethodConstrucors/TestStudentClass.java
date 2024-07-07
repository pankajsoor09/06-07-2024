package com.javaThisMethodConstrucors;

public class TestStudentClass 
{

	public static void main(String[] args) 
	{

		Department d11 = new Department();
		d11.studentDeparmentDetails();

		System.out.println("--------------------------------");

		
		Department d1 = new Department(101, "HR");
		d1.studentDeparmentDetails();
	}

}
