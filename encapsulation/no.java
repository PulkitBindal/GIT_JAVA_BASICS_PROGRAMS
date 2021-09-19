import java.util.*;
class number
{
	int x;
	void num(int a)
	{
		x=a;
	}
	void show()
	{
		System.out.println(x);
	}
}
class no
{
	public static void main(String s[])
	{

		number n=new number();
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		n.num(x);
		n.show();
	}
}