package collection;

import java.util.ArrayList;
import java.util.List;

public class Continslist {

	public static void main(String[] args) 
	{
		List <String> obj=new ArrayList<String>();
		{
			obj.add("green");
			obj.add("priya");
			obj.add("red");
			obj.add("pink");
			obj.add("orange");
			//boolean a=obj.contains("green");
			boolean a=obj.contains("black");
		    System.out.println(a);
		}

	}

}
