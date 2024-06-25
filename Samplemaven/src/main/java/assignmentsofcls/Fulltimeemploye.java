package assignmentsofcls;

public class Fulltimeemploye extends Employe
{
	public int finalsalary;
	public int totalsalary;
 public int payementperhour;
 public int workinhghours;

public Fulltimeemploye(int finalsalary)
{
this.finalsalary=finalsalary;
}

public void display()
{
System.out.println("contractror salary"             +totalsalary);
System.out.println("fulltimeemploye salary"         +finalsalary);
}

public static void main(String[] args) 
{
	Fulltimeemploye obj=new Fulltimeemploye(100);
	Contractor obj1=new Contractor(100,20);
	obj.display();
}
@Override
public double calculatesalary() 
{
	finalsalary= payementperhour*workinhghours;
	return finalsalary;
}

}