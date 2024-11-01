package extraprograms;

public class Usageconstr {
	static String name1;
	static int age1;
	public Usageconstr(String name,int age)
	{
		name1=name;
		age1=age;
	}
public static void display()
{
	
	System.out.println(name1);
	System.out.println(age1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usageconstr obj=new Usageconstr("priya",33);
	
		Usageconstr.display();
	}

}
