package polymorpismexmpls;

public class Polychildex extends polyparentex
{
	public void display()
	{
		System.out.println("this is a child class methd overriding");
		super.display("this is a parent class with same methd name");
	}

	public static void main(String[] args) {
		Polychildex obj=new Polychildex();
		obj.display();

	}

}
