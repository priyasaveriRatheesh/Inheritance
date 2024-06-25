package assignmentsofcls;

public class Divisionchild  extends Additionparent
{
	public	int qusnt;
public void  result()
{
	super.add(a,b);
			 qusnt=sum %  10;
			 if(qusnt==0)
			{
				System.out.println("divisible");
			}
			else
			{
				System.out.println("not divisible");
			}
}
public void display()
{
	System.out.println("sum is" +sum);
	//System.out.println("quotient is "+qusnt);
}
public static void main(String args[]) 
{
		Divisionchild obj=new Divisionchild();
		obj.add(5,4);
		obj.display();
		obj.result();
}
}

