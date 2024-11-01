package extraprograms;

public class Singlechild  extends Singleinheritanc{

	
	public void display2()
	{
		System.out.println("i am the child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlechild obj=new Singlechild();
		obj.display();
		obj.display2();
	}

}
