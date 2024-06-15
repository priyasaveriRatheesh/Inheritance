package methodsexample;

public class Constrcrusage {
static int age1;
static String name1;
public Constrcrusage(int age,String name)
	{
		age1=age;
		 name1=name;
			}
public static void disply()
{
	System.out.println(age1+ " " +name1);
}
	public static void main(String[] args) 
	{
		Constrcrusage obj=new Constrcrusage(8,"saveri");
		Constrcrusage.disply();
	}

}
