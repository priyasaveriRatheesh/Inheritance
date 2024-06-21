package assignmentsofcls;

public class Asignmtonsesnchild2 extends Onsesonpolyparent {
	public void discount(int cost)
	{
	int discountrate=40/100*cost;
	System.out.println(discountrate);
}
public static void main(String args[])
{

	Asignmtonsesnchild2 obj=new Asignmtonsesnchild2();
	//offseasondiscountchild obj1=new offseasondiscountchild();
	obj.discount(100);
	//obj1.discount(200);
}
}
