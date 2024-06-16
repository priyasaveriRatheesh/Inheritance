package inheritanceexample;

public class Inheritancechild  extends Inheitnceparent{
	
public void display2()
{
	System.out.println("i am a child");
}
	public static void main(String[] args) {
		Inheritancechild obj=new Inheritancechild();
		obj.display();
		obj.display2();

	}

}
