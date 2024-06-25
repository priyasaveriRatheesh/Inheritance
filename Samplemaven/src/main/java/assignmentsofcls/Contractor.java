package assignmentsofcls;

public class Contractor extends Employe {
	 int  payementperhour;
	int workinhghours;	
 int totalsalary;
public Contractor(int payementperhour,int workinhghours)
{
this.payementperhour=payementperhour;
this.totalsalary=workinhghours;
}
			 
			@Override
			public double calculatesalary()
			{
				int totalsalary=payementperhour * workinhghours;
				 return totalsalary;
	
			}
}