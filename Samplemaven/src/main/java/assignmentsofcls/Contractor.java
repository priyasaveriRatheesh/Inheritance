package assignmentsofcls;

public class Contractor extends Employe {

public static void main(String[] args) 
{
	Contractor obj=new Contractor();
	obj.calculatesalary(1000, 6);
	obj.Fulltimeemploye();
	
}

@Override
public void calculatesalary(int payment, int time) {
	this.payment=payment;
	int contractorsalary=payment*time;
	System.out.println(contractorsalary);
	
}
}