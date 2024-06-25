package exceptionsexamples;

public class Customiedexceptn 
{
	public void exception(int age) throws InvalidException
	{
	if(age>=18)
	{
		System.out.println("eligible");
	}
	else
	{
		throw new InvalidException("invalid age");
	}
	}

		public static void main(String[] args) throws InvalidException 
		
		{
			Customiedexceptn obj=new Customiedexceptn();
			obj.exception(10);
			}


	}


