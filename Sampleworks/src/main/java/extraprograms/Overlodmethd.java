package extraprograms;

public class Overlodmethd {
	
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
public static void add(int a,int b,int c)
{
	int sum=a+b+c;
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overlodmethd.add(10, 20);
		Overlodmethd.add(10,20, 30);
	}

}
