package assignmentsofcls;

public class Addressagregtnassnmt {
	String city;
	int pin;
	StudentAggregtnparent ref;
	public void address(String city,int pin,StudentAggregtnparent ref )
	{
		this.city=city;
		this.pin=pin;
		this.ref=ref;
	}

	public void display()
	{
		System.out.println("STUDENT NAME:"+ref.name);
		System.out.println("ROLL NUMBER:"+ref.rollnum);
		System.out.println("ADDRESS:" +city+ " "+pin);
	}
	public static void main(String[] arg) {
		StudentAggregtnparent obj=new StudentAggregtnparent();
		Addressagregtnassnmt obj1=new Addressagregtnassnmt();
		obj1.address("kollam", 690523,obj);
		obj.student("ABC", 10);
	obj1.display();
		
	}

}
