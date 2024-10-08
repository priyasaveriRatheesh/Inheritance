package inheritanceexample;

public class Employeeonechild  extends Employeeoneparent
{
int bonus=25000;

	public static void main(String[] args) 
	{
		Employeeonechild obj=new Employeeonechild();
		//System.out.println(obj.salary);
		//System.out.println(obj.bonus);
	int x=obj.salary;
	int y=obj.bonus;
	System.out.println(x);
	System.out.println(y);
	

	}

}
