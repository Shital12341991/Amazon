package com.aspire.WeeklyMock;

import java.util.HashMap;

public class Mapping
{
   public static void main(String[] args) 
   {
	  HashMap hm =new HashMap<Integer, String>();
	  hm.put(1, "Ravindranath");
	  hm.put(2, "Janardhan");
	  hm.put(3, "Shital");
	  hm.put(4, "Shivam");
	  
	  System.out.println(hm);
	  System.out.println( hm.containsKey(7));
	  System.out.println(hm.containsValue("Shivam"));
	System.out.println(hm.remove(4, "Shivam"));
	  System.out.println(hm.remove("Shivam"));
	  System.out.println(hm);
	  System.out.println(hm.replace(1,"Ravi"));
	  System.out.println(hm);
	  
	  for (int i =1; i<=hm.size();i++)
	  {
		  System.out.print(hm.get(i)+" ,");
	  }
//	  for (Integer Key:hm.keySet())
	  {
		  
	  }
	  {
		   
	  }
		  
	  {
		  
	  }
   }
}
