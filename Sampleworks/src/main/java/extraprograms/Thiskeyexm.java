package extraprograms;

public class Thiskeyexm {
int age;
String name;
			public Thiskeyexm(int age,String name)
		{
			this.age=age;
			this.name=name;
		}
			public void display()
			{
				System.out.println(age+"  "+name);
			}
		public static void main(String[] args) {
			Thiskeyexm obj=new Thiskeyexm(18,"priya");
			obj.display();
		
	}

}
