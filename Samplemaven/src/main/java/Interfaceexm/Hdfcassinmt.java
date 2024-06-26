package Interfaceexm;

public class Hdfcassinmt implements assignmtRBI
{
int amount;
int duration;
int intrest;

	public static void main(String[] args)
	{
		Hdfcassinmt obj=new Hdfcassinmt();
		obj.recurentdeposit(100000, 5, 3);

	}

	@Override
	public void recurentdeposit(int amount, int duration, int rate) {
		intrest=(amount*rate*duration)/100;
		System.out.println("deposited amount is:"   +amount);
		System.out.println("number of years:"       +duration);
		System.out.println("interest rate is:"   +rate+"%" );
		System.out.println("interest amount:"     +intrest);
	}

}
