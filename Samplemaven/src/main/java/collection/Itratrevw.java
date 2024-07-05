package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Itratrevw 
{

	public static void main(String[] args) 
	{

		ArrayList<Integer> obj=new ArrayList<Integer>();
		{
			obj.add(1);
			obj.add(2);
			obj.add(3);
			obj.add(4);
			obj.add(5);
			{
			System.out.println(obj);
			}
		}
			Iterator<Integer> it=obj.iterator();
				while(it.hasNext())
			{
		System.out.println(it.next());
	}
	
	}
}
	
