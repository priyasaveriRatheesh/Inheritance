package inheritanceexample;

public class Superchildinstancvarble extends Superkeyparentintancevarible 
{
	String clr="red";
	public void display() 
	{
	
		System.out.println(clr);
	// super(clr);
	}
		public static void main(String[] args) {
			Superchildinstancvarble obj=new Superchildinstancvarble();
		obj.display();
	}
}
