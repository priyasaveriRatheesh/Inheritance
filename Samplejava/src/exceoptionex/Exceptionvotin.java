package exceoptionex;

public class Exceptionvotin {

	public static void main(String[] args) {
		int age=14;
		if(age>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			throw new ArithmeticException("invalid age");
		
	}

}}
