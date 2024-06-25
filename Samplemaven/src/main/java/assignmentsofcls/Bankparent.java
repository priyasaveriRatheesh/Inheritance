package assignmentsofcls;

public class Bankparent {
		private int pin;

		public int getPin()
		{
			return pin;
		}

		public void setPin(int pin)
		{
			this.pin = pin;
		}

		public void display()
		{
			if(pin==1001)
			{
				System.out.println("valid pin number");
				
			}
			else if(pin==1234)		
			{
				System.out.println("valid pin number");
			}
			else if(pin==1212)
			{
				System.out.println("valid pin number");
			}
			else
			{
				System.out.println("invalid pin number");
			}	
			
		}
}