package myworks;

public class Animalchild  extends Animalparent
{
	public void dog()
	{
		System.out.println("barking");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animalchild obj=new Animalchild();
		obj.dog();
		obj.eat();
	}

}
