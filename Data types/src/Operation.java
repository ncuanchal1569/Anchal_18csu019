class Operation
{
	public static void main(String args[])
	{
	  int a, b, sum, difference, product, moduls;
	  float quotient;
	  Scanner scan=new Scanner(syestem.in);
	  Syestem.out.print("Enter two integer");
	  a = scan.nextInt();
	  b = scan.nextInt();	
	  sum = a+b;
	  diff = a-b;
	  product = a*b;
          quotient = (float)a/b;
           modulo = a%b;
	  System.out.println("Sum:" +sum);
	  System.out.println("Difference:" +difference);
	  System.out.println("Product:" +product);
	  System.out.println("Quotient:" +quotient);
	  System.out.println("Remainder:" +remainder);

	}
}