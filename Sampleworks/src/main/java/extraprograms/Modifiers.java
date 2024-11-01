package extraprograms;

public class Modifiers {
		
		public  void display1()
	
		{
			System.out.println("public");
		}
private  void display2()
{
	System.out.println("private");
	}
 protected void display3()
 {
	 System.out.println("protected");
 }
 
  void display4()
 {
	 System.out.println("default");
 }
 
public static void main(String[] args)
{
	Modifiers obj=new Modifiers();
	obj.display1();
	obj.display2();
	obj.display3();
	obj.display4();
}
}