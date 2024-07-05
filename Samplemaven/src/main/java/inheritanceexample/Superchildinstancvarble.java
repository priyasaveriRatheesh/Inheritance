package inheritanceexample;

public class Superchildinstancvarble extends Superkeyparentintancevarible 
{
	String c="red";
	public void display() 
	{
		System.out.println(super.c);
		System.out.println(c);
		
	
	}
		public static void main(String[] args) {
			Superchildinstancvarble obj=new Superchildinstancvarble();
		obj.display();
	
	}
}
