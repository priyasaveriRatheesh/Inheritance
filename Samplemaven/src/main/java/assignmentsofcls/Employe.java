package assignmentsofcls;

public abstract class Employe
{
int payment;
int time;
	public abstract void calculatesalary(int payment,int time);



public void Fulltimeemploye()
{
	int fulltimesalary=this.payment*8;
	System.out.println(fulltimesalary);
}
}
