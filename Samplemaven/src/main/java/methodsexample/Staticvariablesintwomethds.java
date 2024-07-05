package methodsexample;

public class Staticvariablesintwomethds {
static int a=20;
static int b=10;
	public static void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
public static void sub()
{
	int diff=a-b;
	System.out.println(diff);
}
	
public static void main(String[] args) 
{
	
	Staticvariablesintwomethds.add();
	Staticvariablesintwomethds.sub();
	}

}
