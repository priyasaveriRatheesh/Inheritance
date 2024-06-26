package collection;

import java.util.ArrayList;

public class ItrateAssignmt {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList <String>();
		obj.add("violet");
		obj.add("indigo");
		obj.add("blue");
		obj.add("green");
		obj.add("yellow");
		obj.add("red");
		System.out.println(obj);
for(int i=0;i<obj.size();i++)
{
	System.out.println(obj.get(i));
}
System.out.println("USING FOREACH LOOP.............");

for(String s:obj)
{
	System.out.println(s);
}
}
	
}