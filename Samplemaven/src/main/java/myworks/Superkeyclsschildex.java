package myworks;

public class Superkeyclsschildex extends Superkeyclssparent{
	public void display()
	{
		System.out.println("same method name as parentclass");
	}
public void display1()
{
	System.out.println("i am child");
	
}
public void print()
{
	super.display();
	display1();
	//display3();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeyclsschildex obj=new Superkeyclsschildex();
		obj.print();
	}

}
