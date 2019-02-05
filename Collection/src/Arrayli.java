import java.io.*;
import java.util.*;
class Arrayli
{
	public static void main(String[]args) throw IOException
	{
	 int n= 5;
	 ArrayList<Integer>arrli= new ArrayList<Integer>(n);
	 for(int= i; i<= n; i++)
	 arrli.add(i);
	 System.out.println(arrli);
	 arrli.remove(3);
	 for(int i=0; i<arrli.size(); i++)
	 System.out.print(arrli.get(i)+" ");
	}
}