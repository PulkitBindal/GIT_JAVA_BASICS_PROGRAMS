import java.util.Scanner;
class number
{
	int ft,ct;
	void fun(int a)
	{
		ft=a;
	}
	void show()
	{
		ct=(ft-32)*5/9;
		System.out.println("fehrenite temp is="+ft);
		System.out.println("celcius temp is"+ct);
	}
}
class temp
{
	public static void main(String s[])
	{
		Scanner obj=new Scanner(System.in);
		number n=new number();
		System.out.println("enter fehrenite temp");
		int ft=obj.nextInt();
		n.fun(ft);
		n.show();
	}
}