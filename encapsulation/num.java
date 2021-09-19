import java.util.Scanner;
class number
{
	int n;
	void fun()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		n=in.nextInt();
		if(n%2==0)
		{
			n++;
			if(n%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
				
		}
		else
		{
			n--;
			if(n%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
		
	}
}
class num
{
	public static void main(String arg[])
	{
		number obj=new number();
		obj.fun();

	}

}