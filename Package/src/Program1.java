import java.lang.NullPointerException;
public class Program1
{
	private static Integer i= null;
	public static void main(String[]args)
	{
	 try
	 {
	 System.out.println(i.toString());
	 }
	 catch(nullPointerexception e)
	 {
	 System.out.println("Caught");
	 e.printStackTrace();
	 }
	 try
	 {
	 i= 10;
	 System.out.println(i.toString());
	 }
	 catch(nullPointerException e)
	 {
	 System.out.println("Caught");
	 e.printStackTrace();
	 }
	 finally
	}
	 {
	 System.out.println("finally");
	}
	
}