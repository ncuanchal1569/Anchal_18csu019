private static class Entry
{
	Object elements;
	Entry next;
	Entry previous;
	Entry(Object elements,Entry next, Entry previous)
	{
	  this.elements= elements;
	  this.next= next;
	  this.previous= previous;
	}
}
private Entry header= new Entry(null,null,null);
public LinkedList()
{
	header.next= header.previous= header;
}