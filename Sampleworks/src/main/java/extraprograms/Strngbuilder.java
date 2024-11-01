package extraprograms;

public class Strngbuilder {

	public static void main(String[] args) {
		StringBuilder obj=new StringBuilder("hello");
		//obj.insert(5, "world");
		//System.out.println(obj);
		//obj.delete(0, 3);
		//System.out.println(obj);
		//obj.append("hiii");
		//System.out.println(obj);
		obj.replace(2, 3,"hiiii");
		System.out.println(obj);
		
		

	}

}
