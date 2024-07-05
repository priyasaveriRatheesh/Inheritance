package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetexampl
{

	public static void main(String[] args) //tree set is generic type
	{
		TreeSet<String> obj=new TreeSet<String>();
		obj.add("priya");
		obj.add("red");
		obj.add("green");
		obj.add("orange");
		obj.add("white");
		System.out.println(obj);
						
		obj.remove("priya");
		System.out.println(obj);
		
		boolean b=obj.isEmpty();
		System.out.println(b);
		
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		obj.descendingIterator();
		System.out.println(obj);
		
		boolean s=obj.contains("priya");
		System.out.println(s);
		
		obj.clone();
		System.out.println(obj);
		
		
		obj.ceiling("priya");
		System.out.println(obj);
		
		obj.clear();
		System.out.println(obj);

	


	}

}
