package methodsexample;

public class Methdoverloding1 {
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void add(int a,int b,int c)
	{
		int sum1=a+b+c;
		System.out.println(sum1);
	}

	public static void main(String[] args)
	{
		
		Methdoverloding1.add(10,20);
		Methdoverloding1.add(10, 20, 30);
	}

}
