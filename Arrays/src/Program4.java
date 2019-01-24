import java.util.*;
class Program4
{
	public static void main(String[]args)
	{
	  Scanner con= new Scanner (System.in);
	  int[] arr= new arr[5];
	  int[] arr2= new arr[5];
	  System.out.print("Enter first element:");
	  arr[0]= con.nextInt;
	  arr2[0]= arr[0];
	  boolean check;
	  int m=1;
	  for(i=1;i<5;i++)
	   {
	       System.out.println("Enter the element:");
	       arr[x]=con.next.Int();
	       check=false;
	       for(int j=0;j<=(x-1);j++)
	       {
	          if(arr[x]==arr[j])
	           {
	            check=true;
	           }
            }
            if(check==false)
            {
                arr2[m]=arr[x];
                m++;
            }
	        for(int n=0;n<m;n++)
	        {
	           System.out.print(arr2[n]+"\t");
	        } 
	    }
	    if(m==5)
	    {
           System.out.println("Worst Case:(");
	    }
    }
}

	
