package extraprograms;

public class Aggrichild {
	String rank;
	Agriparent add;
	public Aggrichild(String rank,Agriparent add)
	{
	this.rank=rank;
	this.add=add;
	}
	public void display3()
	{
		System.out.println(rank);
		System.out.println(add.name+" "+add.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agriparent obj1=new Agriparent("priya",1);
		Aggrichild obj2=new Aggrichild("ist",obj1);
		obj2.display3();

	}

}
