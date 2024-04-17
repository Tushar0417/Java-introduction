import java.util.*;
public class DynaFORINTEGERVALUEmicARRAY 
{
	public static void main(String args[])

	{

	Scanner s=new Scanner(System.in);

	System.out.println("Enter size of an array:");

	int n=s.nextInt();

	int a[]=new int[n];

	System.out.println("Enter array elements:");

	for (int i=0;i<n;i++)

	{

	a[i]=s.nextInt();

	}

	System.out.println("Entered array elements are:"); 
	for (int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	}
}
