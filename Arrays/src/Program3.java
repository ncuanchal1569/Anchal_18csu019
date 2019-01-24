import java.util.*;
class Program3
{
	public static void main(String[]args)
	{
	 int a[]= new int[] {23,45,67,46,65,43};
	 int min= a[0];
	 int max= a[0];
	 for(int i=1;i<a.length; i++)
	 {
	  if(a[i]>max)
	  {
	   max= a[i];
	  }
	   if(a[i]<min)
	  {
	   min= a[i];
	  }
	 }
	  System.out.println("largest Number in a given array is:" +max);
	  System.out.println("smallest Number in a given array is:" +min);

	}
}