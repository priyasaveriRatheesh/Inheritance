package collection;

import java.util.ArrayList;

public class Search {

	public static void main(String[] args) 
	{
			ArrayList <String> obj=new ArrayList <String>();
		obj.add("violet");
		obj.add("indigo");
		obj.add("blue");
		obj.add("green");
		obj.add("yellow");
		obj.add("red");
		System.out.println(obj);
		
		for (String s:obj)
		{
	        if (s.contains("green"))
	        	
	         {
	               System.out.println(s);
			}
}
}
}