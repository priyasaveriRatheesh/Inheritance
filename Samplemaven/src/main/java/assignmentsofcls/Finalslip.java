package assignmentsofcls;

public class Finalslip extends Inheritanceassigmntchild {
	int salaryslip;
			public void finalsalary()
		{
		int total=basicpay+hradeduction+pfdeduction+bonus;
		System.out.println(" bonus is "+bonus);
		System.out.println("total salary is:"+total);
	}

	public static void main(String[] args) {
		Finalslip obj2=new Finalslip();
		obj2.totalsalary(10000, 20, 5, 100);
		obj2.calculate();
		obj2.finalsalary();

	}

}
