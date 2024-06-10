package com.aspire.WeeklyMock;

public class PalindromeString
{
	public static void main(String[] args) 
	{
		String s = "Ravindranath";
		String rev ="";
		for (int i =s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		if (rev.equals(s))
		{
			System.out.println("Given String is Palindrome String");
		}
		else 
		{
			System.out.println("Given String is Not Palindrome String");
		}
	}

}
