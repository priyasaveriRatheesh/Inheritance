package collection;

import java.util.LinkedList;//non generic

public class Linkdlistgeneric 
{
	public static void main(String[] args) 
	{
		LinkedList obj=new LinkedList();
		obj.add("hello");
		obj.add(100);
		obj.add('a');
		obj.add(100.2355);
		System.out.println(obj);

	}

}
