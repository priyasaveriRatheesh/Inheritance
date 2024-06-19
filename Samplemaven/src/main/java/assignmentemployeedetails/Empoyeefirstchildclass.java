package assignmentemployeedetails;
public class Empoyeefirstchildclass extends Empoyeefirstclassparent
{
	public int hra;
	public int pf;
	public void deductions()	
	{
  hra=basicpay*5/100;
  pf=basicpay*20/100;
	System.out.println("hra is:"+hra);
	System.out.println("pf is:"+pf);
	}		
}
