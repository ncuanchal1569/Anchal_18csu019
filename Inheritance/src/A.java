import java.util.Scanner;
class A
{
	void callme()
	{
	  System.out.println("Inside A's callme method");
	}
}
class B extends A
{
	void callme()
	{
	   System.out.println("Inside B's callme method");
	}
}
class C extends A
{
	void callme()
	{
	  System.out.println("Inside C's callme method");
	}
}