package collection;

import java.util.ArrayList;
import java.util.List;

public class Addalllist
{
	public static void main(String[] args) 
	{
	ArrayList <String> obj1=new ArrayList<String>();
		{
			obj1.add("green");
			obj1.add("priya");
			obj1.add("red");
			obj1.add("pink");
			obj1.add("orange");//first list
			
			
			ArrayList <String> obj2=new ArrayList<String>();
			{
				obj2.add("apple");
				obj2.add("orange");
				obj2.add("grapes");
				obj2.add("banana");
				obj2.add("mango");//2nd
			
			obj1.addAll(obj2);
			System.out.println(obj1);
			}
		}
	}

}
