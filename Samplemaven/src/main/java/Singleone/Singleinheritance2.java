package Singleone;

public class Singleinheritance2 extends Single1{
	public void print()
	{
		System.out.println("welcome to child");
	}

	public static void main(String[] args) {
		Singleinheritance2 obj=new Singleinheritance2();
		obj.display();
		obj.print();

	}

}
