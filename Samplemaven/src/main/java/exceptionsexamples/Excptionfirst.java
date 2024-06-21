package exceptionsexamples;

public class Excptionfirst {

	public static void main(String[] args) {
	int a=10;
	int b=0;
	try
	{
	int c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException error)
	{
		System.out.println("overcome"+ " "  +error);
	}
	finally
	{
		System.out.println("compulsory comments will execute here");
	}
	}

}
