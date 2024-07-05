package methodsexample;

public class Thismethd {
	int a;
	int b;
	int sum;
	public  void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		this.sum=sum;
		sum=a+b;
	}
public void display()
{
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Thismethd obj=new Thismethd();
		obj.add(10, 20);
		obj.display();
		
	}

}
