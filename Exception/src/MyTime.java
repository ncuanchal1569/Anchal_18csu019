import java.util.*;
class MyTime
{
	private int hour;
	private int minute;
	private int second;
	MyTime()
	{
	  this.hour= 0;
	  this.minute= 0;
	  this.second= 0;
	}
	MyTime(int hour,int minute,int second)
	{
	  this.hour= hour;
	  this.minute= minute;
	  this.second= second;
	}
	public void setTime(int hour)
	{
	  this.hour= hour;
	}
	public int getTime()
	{
	  return this.hour;
	}
	public void setTime(int minute)
	{
		this.minute= minute;
	}
	public int getTime()
	{
		return this.minute;
	}
	public void setTime(int second)
	{
		this.second= second;
	}
	public int getTime()
	{
		return this.second;
	}
	public
}