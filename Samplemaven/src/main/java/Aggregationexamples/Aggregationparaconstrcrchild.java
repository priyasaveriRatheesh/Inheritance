package Aggregationexamples;

public class Aggregationparaconstrcrchild {
	int rollnum;
	String rank;
	Aggregationparentconstrcr ref;//aggregation
	
	public Aggregationparaconstrcrchild(int rollnum,String rank,Aggregationparentconstrcr ref)
	{
		this.rollnum=rollnum;
		this.rank=rank;
		this.ref=ref;
	}

	public void display()
	{
		System.out.println(rollnum+" "+rank);
		System.out.println(ref.name+" "+ref.age+"  "+ref.place+" "+ref.pincode);
	}
	public static void main(String[] args) {
		Aggregationparentconstrcr obj=new Aggregationparentconstrcr("priya",29,"karunagappally",690523);
		Aggregationparaconstrcrchild obj1=new Aggregationparaconstrcrchild(15,"first",obj);//parentclass obj also invoked in child class
		obj1.display();

	}

}
