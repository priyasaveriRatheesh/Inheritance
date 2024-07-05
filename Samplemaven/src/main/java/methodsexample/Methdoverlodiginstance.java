package methodsexample;

public class Methdoverlodiginstance 
{
public void display1(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}
public void display1(int a,int b,int c)
{
	int sum1=a+b+c;
	System.out.println(sum1);
}
	public static void main(String[] args)
	{
		
		Methdoverlodiginstance obj=new Methdoverlodiginstance();
		obj.display1(10, 20);
		obj.display1(10, 20, 30);
	}

}
