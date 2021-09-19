import java.util.Scanner;
class number
{
	int a,b;
	void input(int x,int y)
	{
		a=x;
		b=y;
	}
	void check()
	{
		if(a>b)
			System.out.println(a+" is greater than "+b);
		else
			System.out.println(b+" is greater than "+a);
	}
}
class example1
{
	public static void main(String args[])
	{
		number n=new number();
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any two number");
		a=in.nextInt();
		b=in.nextInt();
		n.input(a,b);
		n.check();
	}
}