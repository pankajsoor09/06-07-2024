package com.javaThisMethodConstrucors;

public class Product 
{
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		
		//System.out.println("default constructor");
	}

	public Product(int productId, String productName, double productPrice) 
	{		
		System.out.println("parameterized constructor");
	}
	
	public void getProduct1()
	{
		System.out.println("getProduct1() method called");
		this.getProduct2();
	}
	
	public void getProduct2()
	{
		System.out.println("getProduct2() method called");
	}
}
