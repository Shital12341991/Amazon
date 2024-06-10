package com.aspire.WeeklyMock;

public class Method 
{

		static int x=10;
		int y=20;

		public static void main (String[]args)
		{

			Method t1=new Method();
		t1.x=30;
		t1.y=40;

		Method t2=new Method();
		System.out.println(t2.x);  //30
		System.out.println(t2.y);  //20  ( Instance Variable )
		}
		
		
}

