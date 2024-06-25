package assignmentsofcls;

public class Offseasonparent {

	double discount;
	double originalprice;
	double discountrate;
	
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
	
}
