package exceoptionex;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;
try {
int c=a/b;
System.out.println(c);
}
catch (ArithmeticException e)
{
	System.out.println("error"+ "  " +e);
}
finally {
	System.out.println("thanku");
}
}
	
	
}