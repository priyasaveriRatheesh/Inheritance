package assignmentsofcls;

public class Bankparent {
	 int[] validPin= {1001,1234,1212};
	private int pin1,pin2,pin3;
	public void getPinn(int pin)
	{
System.out.println();
}
	public void setPin(int pin1,int pin2,int pin3)
{
		this.pin1=pin1;
		this.pin2=pin2;
		this.pin3=pin3;
		System.out.println(pin1+" "+pin2+" "+pin3);
}
}
/*	public void validatePin() 
	{
        for(int PIN : validPin) 
	}
    if (this.PIN == validPin) {
                return true;
            }
        }
        return false;
    }
}*/