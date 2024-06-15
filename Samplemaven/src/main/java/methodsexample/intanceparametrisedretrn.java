package methodsexample;

public class intanceparametrisedretrn {
	public int add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intanceparametrisedretrn obj=new intanceparametrisedretrn();
		System.out.println(obj.add());
	}

}
