package extraprograms;

public class Polychilldexmm  extends Polychildexmmm{
	
	public void display()
	{
		System.out.println("polychild");
		super.display("polyparent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polychilldexmm obj=new Polychilldexmm();
		obj.display();
	}

}
