package com.aspire.WeeklyMock;

public class Palindrome_Number 
{
	public static void main(String[] args)
	{
		int num =242;
		int rem =0;
		int rev =0;
		int original=num;
		while(num>0)
		{
			rem =num%10;  // 2 ,4
			rev =rev*10+rem;  //2
			num =num/10;   // 24
		}
		System.out.println(rev);
		System.out.println(original);
		if(rev==original)
		{
			System.out.println("given number is palindrome ");
		}
		else 
		{
			System.out.println("Given number is not palindrome");
		}
		
	}

}
