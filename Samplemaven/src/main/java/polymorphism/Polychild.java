package polymorphism;

public class Polychild extends Polyparent{
	public void display() {
		System.out.println("childprint");
		super.display("polymorphism");
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Polychild obj=new Polychild();
	obj.display();
	}

}
