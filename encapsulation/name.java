import java.util.*;
class name
{
	String n;
	void fun()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter any name");
	n=in.nextLine();
	System.out.println("Great You have entered a good name");
	}




	public static void main(String []t)
	{
		name obj=new name();
		obj.fun();
	}
}