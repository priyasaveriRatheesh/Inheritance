package extraprograms;

public class Instancemethdthis {
	
	public void display1()
	{
		System.out.println("hello");
	}
	
public void display2()
{
	this.display1();
	System.out.println("hiiiiii");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancemethdthis obj=new Instancemethdthis();
		obj.display2();
	}

}
