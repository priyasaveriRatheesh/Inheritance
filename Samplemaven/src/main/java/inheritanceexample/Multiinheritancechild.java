package inheritanceexample;

public class Multiinheritancechild extends Inheritancesecndparent2{
	public void display3()
	{
		System.out.println("i am a child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiinheritancechild obj=new Multiinheritancechild();
		obj.disply1();
		obj.display2();
		obj.display3();
	}

}
