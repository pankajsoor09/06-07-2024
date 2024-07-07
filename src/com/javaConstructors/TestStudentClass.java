package com.javaConstructors;

public class TestStudentClass
{

	public static void main(String[] args)
	{

		Department d1 = new Department (111,"HR");
		d1.studentDepartmentDetails();
		System.out.println(d1.hashCode());
		
		System.out.println();
		
		Department d2= new Department (108,"Development");
		d2.studentDepartmentDetails();
		System.out.println(d2.hashCode());
		
		System.out.println();
		
		Department d3 = new Department(188, "Architect");
		d3.studentDepartmentDetails();
		System.out.println(d3.hashCode());
		
		System.out.println("--------------------------------");

		Department d11= new Department(); //if nothing in default constructor it will return null
		d11.studentDepartmentDetails();
		System.out.println(d11.hashCode());//will return the value in this()
		
		System.out.println();

		
		Department d12= new Department();
		d12.studentDepartmentDetails();
		System.out.println(d12.hashCode());
		
		System.out.println();

		Department d13= new Department();
		d13.studentDepartmentDetails();
		System.out.println(d13.hashCode());
		
	}

}
