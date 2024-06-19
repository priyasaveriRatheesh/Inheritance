package myworks;

public class Aggregationchildex {
	String city;
	int pin;
	Aggregationparentex ref;
public Aggregationchildex(String city,int pin,Aggregationparentex ref) 
{
this.city=city;
this.pin=pin;
this.ref=ref;
}
public void disply()
{
	System.out.println(ref.name+" "+ref.age);
	System.out.println(city+" "+pin);
}

	public static void main(String[] args) {
		Aggregationparentex obj2=new Aggregationparentex("priya",10);
		Aggregationchildex obj1=new Aggregationchildex("karunagappally",690523,obj2);
			obj1.disply();
	}
		
	}
