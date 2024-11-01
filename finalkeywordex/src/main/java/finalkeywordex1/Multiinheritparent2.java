package finalkeywordex1;

public class Multiinheritparent2 extends Multipleinheritdoubtparent1
{
public void msg1()
{
	System.out.println("welcome");
}

public static void main(String args[])
{
	Multiinheritparent2 obj=new Multiinheritparent2();
	obj.msg();
	obj.msg1();
}
}
