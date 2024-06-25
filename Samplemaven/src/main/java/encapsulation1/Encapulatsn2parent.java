package encapsulation1;

public class Encapulatsn2parent {
private	String name;
private int salary;
private String emailid;
private int accontnum;
	public void  setEmploye(String name,int salary,String emailid,int accontnum)
	{
		this.name=name;
		this.salary=salary;
		this.emailid=emailid;
		this.accontnum=accontnum;
		System.out.println(name+" "+salary+" "+emailid+" "+accontnum);
	}
	public void getEmploye() {
		System.out.println();
	}
}
