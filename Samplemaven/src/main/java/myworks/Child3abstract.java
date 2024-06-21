package myworks;

public class Child3abstract  extends Abstarctgoogle{
	public void search()
	{
		System.out.println("all videos");
	}

	public static void main(String[] args) {
		//Abstarctgoogle obj=new Abstarctgoogle();
		Childgoogle obj1=new Childgoogle();
		Child2google obj2=new Child2google();
		Child3abstract obj3=new Child3abstract();

		obj1.search();
		obj2.search();
		obj3.search();
		obj1.searchall();
		obj2.searchall();
		obj3.searchall();
	}

}
