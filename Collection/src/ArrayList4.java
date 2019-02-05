import java.util.*;
class ArrayList4
{
	public static void main(String args[])
	ArrayList<String>list= new Arraylist<String>();
	list.add("Ravi");
	list.add("Vijay");
	list.add("Ravi");
	list.add("Ajay");
	System.out.println("Transversing list through List Iterator:");
	ListIterator<String>list 1= list.listIterator(list.size());
	while(list1.hasPrevious())
	{
	  String str= list1.previous();
	  System.out.println(str);
	}
}