package com.javaConstructors;

public class Department
{

	//fields 
	private int departmentId;
	private String departmentName;
	
	//constructors: default/zero-parameterized
	/*
	 * this(): In a class calling one constructor to another constructor using this() method,
	 *  this process we can called constructor chaining.
	 */
    public Department()//Constructor call must be the first statement in a constructor
	
    {
    	this(106,"HR");//calling parameterized constructor
    	departmentId = 445;
    	departmentName = "Account";
    }

	public Department(int departmentId, String departmentName)
	{
		
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	//method
	public void studentDepartmentDetails()
	{
		System.out.println(departmentId);
		System.out.println(departmentName);
		
		
	}
	
}
