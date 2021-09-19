import java.util.Scanner;
class number
{
	int n;
}
class example3
{
	public static void main(String s[])
	{
		Scanner in=new Scanner(System.in);
		number n1=new number();
		number n2=new number();
		System.out.println("Enter any two number");
		n1.n=in.nextInt();
		n2.n=in.nextInt();
		System.out.println(n1.n);
		System.out.print(n2.n);
	}
}