package Superkeyword;

public class Nonparametrised extends Parametrisedclss {
	public void display()//instnce methd
	{
		
		System.out.println("parametrised and non parametrised method");
		super.add(10,20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonparametrised obj=new Nonparametrised();
		obj.display();
		
 
	}

}
