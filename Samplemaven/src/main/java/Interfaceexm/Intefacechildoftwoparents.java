package Interfaceexm;

public class Intefacechildoftwoparents implements Interfaceonechild,Intefacetwochild
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intefacechildoftwoparents obj=new Intefacechildoftwoparents();
		obj.add1();
		obj.add2();

	}

	@Override
	public void add2() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}

	@Override
	public void add1() {
		// TODO Auto-generated method stub
System.out.println("sum is:");
	}

}
