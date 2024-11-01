package extraprograms;

public class Stngbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int [2];
				arr[0]=10;
		arr[1]=20;
		try
		{
		arr[2]=30;
		for(int i=0;i<arr.length;i++)
		{
	System.out.println(arr[i]);
		}
		}
		
			catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
		}
	}

/*catch
{
	}

}
*/