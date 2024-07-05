package methodsexample;

public class Twoconstrcrthiskeyword {
	public Twoconstrcrthiskeyword()
	{
		this(10,20);
		System.out.println("hello dear");
	}
public Twoconstrcrthiskeyword(int a,int b)
{

	int sum=a+b;
	System.out.println(sum);
}
	public static void main(String[] args) 
	{
		Twoconstrcrthiskeyword obj=new Twoconstrcrthiskeyword();
		
	}

}
