package inheritanceexample;

public class Hirarchichild2  extends Hirarchiparent{
	public void display2()
	{
		System.out.println("i am the second child");
	}

	public static void main(String[] args) {
		Hirarchichild2 obj=new Hirarchichild2();
		obj.display();
		obj.display2();

	}

}
