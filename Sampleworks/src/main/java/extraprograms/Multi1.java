package extraprograms;

public class Multi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[][]=new int[2][2];
array[0][0]=10;
array[0][1]=20;
array[1][0]=30;
array[1][1]=40;
for(int i=0;i<array.length;i++)
{
	for(int j=0;j<array.length;j++)

{
System.out.print(array[i][j]+ " ");
}	
System.out.println();
}
}}