package encapsulation1;

public class Encapulatsn2parent {
	String name;
	int salary;
	String emailid;
	int accontnum;
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
