package assignmentemployeedetails;
public class assignmentemployeechild2  extends Empoyeefirstchildclass
{
	
	public void finalsalary()
{
int totalsalary=basicpay+hra-pf- deduction+bonus;
System.out.println(     "SALARYSLIP:");
System.out.println("BASIC PAY:"         +basicpay);
System.out.println("DEDUCTION"          +deduction);
System.out.println("HRA:"               +hra);
System.out.println("PF:"                +pf);
System.out.println("BONUS:"             +bonus);
System.out.println("Total salary is"    +totalsalary);

}
	public static void main(String[] args) 
	{
		assignmentemployeechild2 obj=new assignmentemployeechild2();
		obj.getDetails();
		obj.deductions();
		obj.finalsalary();
		
		

	}

}
