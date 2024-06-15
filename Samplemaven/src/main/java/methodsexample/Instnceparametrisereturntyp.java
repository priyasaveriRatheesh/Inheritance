package methodsexample;

public class Instnceparametrisereturntyp {
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instnceparametrisereturntyp obj=new Instnceparametrisereturntyp();
		System.out.println(obj.add(10,30));/* OR int c=obj.add(10,30);Sysout(c);*/
	}

}
