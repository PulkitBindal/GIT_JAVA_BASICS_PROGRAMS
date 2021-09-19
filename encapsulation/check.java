import java.util.Scanner;
class number
{
	int x;
	void num(int a)
	{
		x=a;
	}
	void fun()
	{
	if(x%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
	}
}
class check
{
	public static void main(String s[])
	{
		int a;
		Scanner obj=new Scanner(System.in);
		number n=new number();
		System.out.println("enter the number");
        a=obj.nextInt();
        n.num(a);
        n.fun();
			}
}