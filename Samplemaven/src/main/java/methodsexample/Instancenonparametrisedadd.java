package methodsexample;

public class Instancenonparametrisedadd {
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Instancenonparametrisedadd obj=new Instancenonparametrisedadd();
		obj.add(10, 20);

	}

}
