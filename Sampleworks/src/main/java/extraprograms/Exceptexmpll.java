package extraprograms;

public class Exceptexmpll {

	public static void main(String[] args) 
{
	int a=10;
	int b=0;
	try
	{
		int c=a/b;
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);
}
	finally
	{
		System.out.println("thank u");
	}

}

}
