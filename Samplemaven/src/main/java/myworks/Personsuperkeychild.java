package myworks;

public class Personsuperkeychild extends Personsuperkeyparent {
	int salary;
	public Personsuperkeychild(String name,int id,int salary)//reusing parent constructor
	{
		super(name,id);
		this.salary=salary;
	}
	public void display()
	{
		System.out.println(name+" "+id+" "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personsuperkeychild obj=new Personsuperkeychild("priya",6868,10000000);
		
		obj.display();
	}

}
