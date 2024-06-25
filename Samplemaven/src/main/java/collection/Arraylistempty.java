package collection;

import java.util.ArrayList;

public class Arraylistempty {

	public static void main(String[] args) 
	{
		ArrayList <String> obj=new ArrayList<String>();
		{
			obj.add("green");
			obj.add("priya");
			obj.add("red");
			obj.add("pink");
			obj.add("orange");
			boolean a=obj.isEmpty();
			System.out.println(a);
		}
	}

}
