package com.aspire.WeeklyMock;

public class ThisSuperKeyword extends Super
{
	 int a = 10;
	 static int b  =20;
	
	public void method()
	{
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.c);
		System.out.println(super.d);
	}
  public static void main(String[] args) 
  {
	  ThisSuperKeyword obj =new ThisSuperKeyword ();
	  obj.method();
	
  }
}
