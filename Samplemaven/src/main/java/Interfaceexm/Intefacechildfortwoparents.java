package Interfaceexm;

public class Intefacechildfortwoparents implements Interfaceone, Intefacetwo{
	

	public static void main(String[] args) {
		Intefacechildfortwoparents obj=new Intefacechildfortwoparents();
		obj.display1();
		obj.display2();

	}

	@Override
	public void display2() {
		System.out.println("secondparent");		
	}

	@Override
	public void display1() {
		System.out.println("firstparent");
		
	}

}
