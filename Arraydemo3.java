
public class Arraydemo3 
{
	public static void main(String args[])

	{

	//1-D array

	int a[]={11,22,33,44,55};  //its correct
	int[] b= {100,200,300,400,500};
	System.out.println(a);  //it gives address
	System.out.println(a[1]);

	int[] [] c= {{20,30},{70,90}};

	//2-D array
	int [][] C= {{20,30},{70,90}};
	System.out.println(c);   //it gives address System.out.println(c[1][0]);
	System.out.println(c[1][0]); 
	
	//3-D array
	int[][][] d= {{{20},{30,40}}};

    System.out.println(d);//it gives address System.out.println(d[0][0][0]);
    System.out.println(d[0][0][0]);
	System.out.println(d[0][1][0]);
	System.out.println(d[0][1][1]);

	}

}
