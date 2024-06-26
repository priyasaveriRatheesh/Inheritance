package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Itratvremovexmpl 
{
	public static void main(String[] args) 
	{
		ArrayList <String> obj=new ArrayList<String>();
		{
			obj.add("green");
			obj.add("priya");
			obj.add("red");
			obj.add("pink");
			obj.add("orange");
			
			
			Iterator<String> it=obj.iterator();
				while(it.hasNext())
			{
		//System.out.println(it.next());
			}
it.remove();
System.out.println(obj);

	}

}
}
