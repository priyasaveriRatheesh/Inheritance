package methodsexample;

public class TwoStaticmethdsparamerized {
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
public static void mul(int a,int b)
{
	int pdt=a*b;
	System.out.println(pdt);
}
	public static void main(String[] args) {
		
		TwoStaticmethdsparamerized.add(10, 20);
		TwoStaticmethdsparamerized.mul(3, 2);
	}

}
