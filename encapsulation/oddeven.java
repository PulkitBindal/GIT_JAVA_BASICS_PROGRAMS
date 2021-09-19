import java.util.Scanner;
class number
{
	int x;
}
class oddeven
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		number x1=new number();
		System.out.println("enter the number");
		x1.x=obj.nextInt();
		if(x1.x%2==0)
		System.out.println("number is even");
	else
		System.out.println("odd");
	}
}