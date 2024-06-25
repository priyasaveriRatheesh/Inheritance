package assignmentsofcls;

public class Onseasonchild extends Offseasonparent {
	
	
	public void discount(double originalprice,double discountrate)
	{
		this.originalprice=originalprice;
		this.discountrate=discountrate;	
			
	}
	public void display()
	{
		discount=originalprice*(discountrate/100);
		System.out.println("original price"+originalprice+"   " +"discount rate" +discountrate+"  "+"total discount"+ "  "    + discount);
	}
	

	public static void main(String[] args) {
		Onseasonchild obj=new Onseasonchild();
				obj.discount(25000, 40);
		obj.display();
		Offseasonparent obj1=new Offseasonparent();
		obj1.discount(25000, 15);
		obj1.display();
	}

}
