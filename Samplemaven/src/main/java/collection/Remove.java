package collection;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List <String> obj=new ArrayList<String>();
		{
			obj.add("green");
			obj.add("priya");
			obj.add("red");
			obj.add("pink");
			obj.add("orange");
		System.out.println(obj);
obj.remove(1);
System.out.println(obj);
obj.remove("pink");
System.out.println(obj);// both ways can use either index postn or obj name
	}
	}
}
