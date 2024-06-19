package assignmentsofcls;

public class Inheritanceassigmntchild extends Inheritnceassignmentparentemply {
	
	int hra;
	int pf;
	public void deductions(int hra,int pf)
	{
		this.hra=hra;
		pf=pf;
	}
public void calculate()
{
	
	int hra=basicpay*5/100;
	int pf=basicpay*20/100;
	System.out.println("hra is:"+hra);
	System.out.println("pf is:"+pf);}		
public static void main(String[] args) {
	Inheritanceassigmntchild obj1=new Inheritanceassigmntchild();
	obj1.totalsalary(1000, 20, 50,100);
	obj1.calculate();

	}

}
