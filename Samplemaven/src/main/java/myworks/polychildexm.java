package myworks;

public class polychildexm  extends polyoverrideparent{
public void polyparant1()
{
	System.out.println("welcome");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polychildexm obj=new polychildexm();
		obj.polyparant1();
		polyoverrideparent obj1=new polyoverrideparent();
		obj1.polyparant1(); 
	}

}
