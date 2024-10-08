package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sethashseexampl {

	public static void main(String[] args) {
		Set obj=new LinkedHashSet();
		obj.add("priya");
		obj.add(1000);
		obj.add('r');
		obj.add(10.25);
		obj.add(null);
		System.out.println(obj);
						
		obj.remove("priya");
		System.out.println(obj);
		
		boolean b=obj.isEmpty();
		System.out.println(b);
		
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
		obj.clear();
		System.out.println(obj);

	}




	}

