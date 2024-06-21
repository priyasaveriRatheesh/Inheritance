package exceptionsexamples;

public class Numberformtexcptns {

	public static void main(String[] args) {
		String course="java";
		try
		{
		int num=Integer.parseInt(course);
		System.out.println(num);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("overcome numberformatexception"+  "  "+ex);
			
		}
		finally {
			System.out.println("thankyou");
		}

	}

}
