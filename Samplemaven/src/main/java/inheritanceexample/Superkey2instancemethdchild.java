package inheritanceexample;

public class Superkey2instancemethdchild extends Superkey2instancemethdparent
{
	public void display()
	{
		System.out.println("i am child run this disply method");
		super.add(10,20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkey2instancemethdchild obj=new Superkey2instancemethdchild();
			obj.display();	
	}

}
