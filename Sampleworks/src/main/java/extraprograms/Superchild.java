package extraprograms;

public class Superchild extends Superkeyparntex
{
	String s="rathesh";

	public void display()
	{
		System.out.println(s);
		System.out.println(super.s);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superchild obj=new Superchild();
		obj.display();
	}

}
