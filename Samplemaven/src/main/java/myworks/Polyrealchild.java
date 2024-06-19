package myworks;

public class Polyrealchild extends Polyrealparent {
	public void display()
	{
		System.out.println("child is printing");
	}

	public static void main(String[] args) {
		Polyrealparent obj=new Polyrealchild();
		obj.display();

	}

}
