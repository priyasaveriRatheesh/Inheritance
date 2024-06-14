package Firstmavenpgms;

public class Accesspecifier1 {
	
		public void display1()
		{
			System.out.println("public stament");
		}
private void display2()
{
	System.out.println("private statement");
	}
protected void display3()
{
System.out.println("protected statement");
}
 void display4()
 {
	 System.out.println("default statemnt");
 }
public static void main(String[] args) 
{
	Accesspecifier1 obj=new Accesspecifier1();
	obj.display1();
	obj.display2();
	obj.display3();
	obj.display4();
			
}
}