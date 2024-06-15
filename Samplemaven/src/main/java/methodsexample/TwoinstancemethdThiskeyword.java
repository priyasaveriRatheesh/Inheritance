package methodsexample;

public class TwoinstancemethdThiskeyword {
	public void display1()
	{
		System.out.println("hello priya");
	}
public void display2()
{
	this.display1();
	System.out.println("welcome to java");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoinstancemethdThiskeyword obj=new TwoinstancemethdThiskeyword();
		obj.display2();
	}

}
