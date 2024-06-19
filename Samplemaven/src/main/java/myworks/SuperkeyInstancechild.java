package myworks;

public class SuperkeyInstancechild extends Thiskeyparentinstancevarible
{
	String color="green";
	public void display1()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		
		SuperkeyInstancechild obj=new SuperkeyInstancechild();
		obj.display1();
	}

}
