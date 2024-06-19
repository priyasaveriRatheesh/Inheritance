package assignmentemployeedetails;
import java.util.Scanner;

public class Empoyeefirstclassparent 
	{
	 	public  int basicpay;
	 	public int  deduction; 
	 	public int bonus;

	 public void getDetails()
	  {
	 System.out.print("Basic Pay: ");
	 Scanner obj = new Scanner(System.in);
	   basicpay = obj.nextInt();
	   System.out.print("Deduction: ");
	   deduction = obj.nextInt();
	    System.out.print("Bonus: ");
	   bonus = obj.nextInt();
	     }

}
