package collection;

import java.util.ArrayList;
import java.util.List;

public class Getobjct {

	public static void main(String[] args) 
	{
		List <String> obj=new ArrayList<String>();
		{
			obj.add("green");
			obj.add("priya");
			obj.add("red");
			obj.add("pink");
			obj.add("orange");
		    System.out.println(obj);
		    String  a=obj.get(1);
		    System.out.println(a);

	}
	}
}
