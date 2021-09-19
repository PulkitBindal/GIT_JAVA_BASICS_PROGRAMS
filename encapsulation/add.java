import java.util.Scanner;
class number
{
	int x,y,c;
		void num(int a ,int b )
		{
         x=a;
         y=b;
        }
    void show()
    {
    	c=x+y;
    	System.out.println("The Sum of Two digits is="+c);

    }
}
class add
{
	public static void main(String args[])
	{
	number n=new number();
	System.out.println("enter two integer number");
	Scanner obj=new Scanner(System.in);
	int a= obj.nextInt();
	int b= obj.nextInt();
	n.num(a,b);
	n.show();
	}
}