package extraprograms;

public class Multichild1 extends Multiinheritanceparent {
	
	public void display1()
	{
		System.out.println("i am the first child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multichild1 obj=new Multichild1();
		obj.display();
		obj.display1();
	}

}
