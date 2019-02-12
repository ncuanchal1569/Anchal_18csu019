import com.ncu.validator.*;
public class Testnamevalidator
{
	public static void main(String[]args)
	{
	   NameValidator csvObject= new NameValidator();
	   boolean checkValidator= csvObject.nameValidator("example.csv","csv");
	   System.out.println(checkValidator);
	   checkValidator= csvObject.nameValidator("","csv");
	   System.out.println(checkValidator);
	   checkValidator= csvObject.nameValidator("example","csv");
	   System.out.println(checkValidator);
	   checkValidator= csvObject.nameValidator("example.csv","csv");
	   System.out.println(checkValidator);
	   checkValidator= csvObject.nameValidator("example4444555566666777775667788888776544566778.csv","csv");
	   System.out.println(checkValidator);
	   checkValidator= csvObject.nameValidator("example@45.csv","csv");
	   System.out.println(checkValidator);
	   checkValidator= csvObject.nameValidator("example.doc","json");
	   System.out.println(checkValidator);
	}
}