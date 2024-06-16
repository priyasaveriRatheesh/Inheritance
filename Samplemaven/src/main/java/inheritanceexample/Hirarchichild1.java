package inheritanceexample;

public class Hirarchichild1 extends Hirarchiparent{
	public void display1()
	{
		System.out.println("i am the first child");
	}

	public static void main(String[] args) {
		
		Hirarchichild1 obj=new Hirarchichild1();
		obj.display();
		obj.display1();

	}

}
