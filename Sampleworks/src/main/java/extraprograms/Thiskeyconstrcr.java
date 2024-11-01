package extraprograms;

public class Thiskeyconstrcr {
	
	public  Thiskeyconstrcr()
	{
		this(10,20);
		System.out.println("java");
	}
	public Thiskeyconstrcr(int a,int b)
	{
	int sum=a+b;
	System.out.println(sum);
	}

	public static void main(String[] args) {
		Thiskeyconstrcr obj=new Thiskeyconstrcr();
		

	}

}
