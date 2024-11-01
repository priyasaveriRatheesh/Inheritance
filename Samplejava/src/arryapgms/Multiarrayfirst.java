package arryapgms;

public class Multiarrayfirst {

	public static void main(String[] args) {
		int array[][]=new int[3][3];
		array[0][0]=10;
		array[0][1]=20;
		array[0][2]=30;
		array[1][0]=40;
		array[1][1]=50;
		array[1][2]=60;
		array[2][0]=70;
		array[2][1]=80;
		array[2][2]=90;
		for(int i=0;i<array.length;i++)
		{
		for(int j=0;j<array.length;j++)
	
		{
			System.out.print(array[i][j] + "  ");
		}
System.out.println();
	}
	}
}