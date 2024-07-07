package com.javaThisMethodConstrucors;

public class Student
{
private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		this.name = name;
	}
	
	public void getStudentName()
	{
		System.out.println(name);
	}
	
	public void getStudent1()
	{
		//setStudent(new Student("Ganesh"));
		setStudent(this);
	}
	
	public void setStudent(Student student)
	{
        student.getStudentName();
	}

}



