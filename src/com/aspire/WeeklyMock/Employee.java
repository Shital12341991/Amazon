package com.aspire.WeeklyMock;

public class Employee
{
	int Emp_id;
	String Emp_Name;
	double Emp_Sal;
	String Emp_Dept;
	String Job;
	
	public void display()
	{
		System.out.println(Emp_id);
		System.out.println(Emp_Name);
		System.out.println(Emp_Sal);
		System.out.println(Emp_Dept);
		System.out.println(Job);
	}
	public static void main(String[] args) 
	{
		
		Employee E1 =new Employee();
		E1.Emp_id =10;
		E1.Emp_Name="Amol Tupe";
		E1.Emp_Sal=30000;
		E1.Emp_Dept="Maintaince";
		E1.Job="Engineer";
		
		
		
		
	}

}
