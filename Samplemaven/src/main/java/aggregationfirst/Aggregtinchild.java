package aggregationfirst;

public class Aggregtinchild {
String rank;
int rollnumber;
Aggregationparent add;// aggregation
public Aggregtinchild(String rank,int rollnumber,Aggregationparent add) 
{
this.rank=rank;
this.rollnumber=rollnumber;
this.add=add;
}
public void display()
{
	System.out.println(rank+" "+rollnumber);
	System.out.println(add.name+" "+add.age+" "+add.city+" "+add.pincode);
}
	public static void main(String[] args) {
		
		Aggregationparent obj=new Aggregationparent("priya",29,"knpy",690523);
		Aggregtinchild obj1=new Aggregtinchild("first",55,obj);//invoking regerebnce variable
		obj1.display();
			}

}
