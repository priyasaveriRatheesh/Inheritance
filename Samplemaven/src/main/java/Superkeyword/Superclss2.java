package Superkeyword;

public class Superclss2 extends Superkey1 {
String clr="red";
public void display()//instnce methd
{
	System.out.println(clr);
	System.out.println(super.clr);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclss2 obj=new Superclss2();
		obj.display();
	}

}
;