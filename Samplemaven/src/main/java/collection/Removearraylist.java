package collection;

import java.util.ArrayList;

public class Removearraylist {

	public static void main(String[] args) 
	{
		ArrayList <String> obj=new ArrayList<String>();
		{
			obj.add("green");
			obj.add("priya");
			obj.add("red");
			obj.add("pink");
			obj.add("orange");
			
			obj.remove("priya");
			System.out.println(obj);
		}
	}

}
