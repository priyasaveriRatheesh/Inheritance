package collection;

import java.util.ArrayList;
import java.util.List;

public class Positionchkset 
{

	public static void main(String[] args)
	{
		
		List <String> obj=new ArrayList<String>();
		{
			obj.add("green");
			obj.add("priya");
			obj.add("red");
			obj.add("pink");
			obj.add("orange");
			obj.add("pink");
			obj.add("yellow");
			obj.add("priya");
			int firstoccurance=obj.indexOf("priya");//int kodukunnat it shows the index position
			System.out.println(firstoccurance);
			int lastoccurance=obj.lastIndexOf("priya");
			System.out.println(lastoccurance);//can change the variablename lastoccurance and firstoccurance
		}
	}
}

			