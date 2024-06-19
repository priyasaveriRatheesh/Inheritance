package myworks;

public class Multichildanimal extends Multiparenttwoinherit {
public void pet()
{
	System.out.println("weeping");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multichildanimal obj=new Multichildanimal();
		obj.dog();
		obj.pet();
		obj.eat();
	}

}
