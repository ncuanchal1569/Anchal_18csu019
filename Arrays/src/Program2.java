import java.util.*;
class Program2
{
	public static void main(String args[])
	{
	 int twoD[] []= new int [14] [15];
	 int i, j, k = 0;
	 for(i=0; i<14; i++)
	 for(j=0; j<15; j++)
	 {
	   twoD[i] [j]= k;
	   k++;
	 }
	 for(i=0; i<14; i++)
	 {
	  for(j=0; j<15; j++)
	  System.out.print(twoD[i] [j] +" ");
	  System.out.println();
	 }
	}
}