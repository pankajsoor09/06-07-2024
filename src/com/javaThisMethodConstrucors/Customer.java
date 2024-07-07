package com.javaThisMethodConstrucors;

public class Customer 
{
	private int cid ;
	private String cname;
	
	public Customer()
	{
		// default constructor
				//this(new Customer(101, "Ganesh"));
	}
	
	public Customer (Customer customer)
	{
		// parameterized constructor 

	}
	public Customer(int cid , String cname)
	{
		this.cid = cid;
		this.cname = cname;
	}
	
	public Customer getCustomer()
	{
		return this;
	}
	
	public void getCustomerData()
	{
		System.out.println(cid);
		System.out.println(cname);
	}

}
