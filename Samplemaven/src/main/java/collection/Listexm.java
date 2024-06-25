package collection;

import java.util.ArrayList;//generic exmple
import java.util.List;

public class Listexm {

	public static void main(String[] args) {
		List <String> obj=new ArrayList<String>();
		{
			obj.add("priya");
			obj.add("green");
			obj.add("orange");
			obj.add("black");
			System.out.println(obj);
		}

		obj.set(2,"white");
		System.out.println(obj);
	}

}
