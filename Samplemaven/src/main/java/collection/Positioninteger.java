package collection;

import java.util.ArrayList;
import java.util.List;

public class Positioninteger {

	public static void main(String[] args) 
	{
		List <Integer> obj=new ArrayList<Integer>();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(11);
		System.out.println(obj);
		int firstoccurnce=obj.indexOf(11);
		System.out.println(firstoccurnce);
		int lastoccurance=obj.lastIndexOf(11);
		System.out.println(lastoccurance);

	}

}

