package methodsexample;

public class Thiskeywrdinstncevar {
	String name;
	int age;
	public Thiskeywrdinstncevar(String name,int age)
		{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(name+"  "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeywrdinstncevar obj=new Thiskeywrdinstncevar("priya",29);
		obj.display();
	}

}
