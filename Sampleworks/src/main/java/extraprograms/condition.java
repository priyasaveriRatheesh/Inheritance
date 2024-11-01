package extraprograms;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=obj.nextInt();
		if(a>=18)
		{
			System.out.println("eligible");
			
		}
		else if(a<18)
		{
			System.out.println("not eligible");
		}
		else if(a==0)
		{
			System.out.println("kid");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
