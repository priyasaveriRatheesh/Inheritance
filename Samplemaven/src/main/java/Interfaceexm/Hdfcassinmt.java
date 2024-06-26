package Interfaceexm;

public class Hdfcassinmt implements assignmtRBI
{
int amount;
int year;
int intrest;

	public static void main(String[] args)
	{
		Hdfcassinmt obj=new Hdfcassinmt();
		obj.recurentdeposit(250000, 5, 8);

	}

	@Override
	public void recurentdeposit(int amount, int year, int rate) {
		intrest=(amount*rate*year)/100;
		System.out.println(amount);
		System.out.println(year);
		System.out.println(rate+"%" );
		System.out.println(intrest);
	}

}
