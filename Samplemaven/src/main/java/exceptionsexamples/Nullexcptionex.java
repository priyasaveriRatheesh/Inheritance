package exceptionsexamples;

public class Nullexcptionex {

	public static void main(String[] args) {
		try
		{
		String name=null;
		System.out.println(name.length());

	}
	catch(NullPointerException er)	
		{
		System.out.println("overcome"+" "+er);
		}
		finally
		{
			System.out.println("thnk you");
		}
	}
}
