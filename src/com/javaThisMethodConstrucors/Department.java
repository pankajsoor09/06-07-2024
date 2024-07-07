package com.javaThisMethodConstrucors;

public class Department
{
	
	//fields(non-static fields)
	private int departmentId;
	private String departmentName;
	
	//constructors: default/zero-parameterized
	public Department()//Constructor call must be the first statement in a constructor
	{
		//this(110, "HR");//calling parameterized constructor
		departmentId = 7878;
		departmentName = "Deployment";
	}
	
	public Department(int departmentId, String departmentName)
	{
		this();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	//methods
	public void studentDeparmentDetails()
	{
		System.out.println(departmentId);
		System.out.println(departmentName);
	}
	

}
