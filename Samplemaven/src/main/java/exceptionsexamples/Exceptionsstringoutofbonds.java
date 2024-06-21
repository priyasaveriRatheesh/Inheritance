package exceptionsexamples;

public class Exceptionsstringoutofbonds {

	public static void main(String[] args) {
		int array[]=new int[3];
		array[0]=10;
		array[1]=15;
		array[2]=20;
		try
		{
		array[4]=25;
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]);
		}
		}
				catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("overcome"+" "+a);
		}
		}
	}


	

