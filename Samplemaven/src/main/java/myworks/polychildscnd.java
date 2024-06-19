package myworks;

public class polychildscnd extends polysndprnt {

	public void animal()
	{
		System.out.println("child clss");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polypara obj=new Polypara();
		polysndprnt obj1=new polysndprnt();
		polychildscnd obj2=new polychildscnd();
		obj.animal();
		obj1.animal();
		obj2.animal();
	}

}
