package extraprograms;

public class Multichild2  extends Multichild1{
	
	public void  display3()
	{
		System.out.println("i am the second child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multichild2 obj=new Multichild2();
		obj.display();
		obj.display3();
		//doubt obj.display1();
	}

}
