package polymorphism;

public class Revwchild extends Revwparent {
	public void display()
	{
		
		System.out.println("this is child class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Revwchild obj=new Revwchild();
		obj.display();
	}

}
