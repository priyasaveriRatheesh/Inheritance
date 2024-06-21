package Interfaceexm;

public class Childinterfaceown implements Myownparentinterface{
	

	public static void main(String[] args) {
		Childinterfaceown obj=new Childinterfaceown();
		obj.printable();

	}

	@Override
	public void printable() {
		System.out.println("hello");		
	}

}
