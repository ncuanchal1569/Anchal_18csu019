import java.lang.Math;
class GFG
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  int n= 5;
	  Pair arr[] = new Pair[n];
	  arr[0] = new Pair(10,20);
	  arr[1] = new Pair(1,2);
	  arr[2] = new Pair(3,1);
	  arr[3] = new Pair(10,8);
	  arr[4] = new Pair(4.3);
	  Compare obj = new Compare();
	  obj.compare(arr,n);
    }
}