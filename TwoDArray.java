import java.util.Scanner;
public class TwoDArray 
{

	public static void main(String args[])

	{

	Scanner s=new Scanner(System.in);

	int r,c,i,j;

	System.out.println("Enter rows:");
	r=s.nextInt();
	System.out.println("Enter cols:");
	c=s.nextInt();
	int a[] [] = new int [r] [c];
	System.out.println("Enter array elements:");
	for(i=0;i<r;i++)
	{
	for(j=0;j<c; j++)
	{
	a[i][j]=s.nextInt();
	}
	}
	//print using enhanced/for each loop System.out.println("Entered matrix:");
	System.out.println("Enter Matrix:");
	for (int x[]:a)

	{

	for(int y:x)
	{
	 System.out.println(y+" ");
	}
	System.out.println();
	}
	
}
} 
