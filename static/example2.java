class number
{
	static int a;
	static void fun()
	{
		a=34;
		System.out.println(a);
	}
}
class example2
{
	public static void main(String arg[])
	{
		int a=0;
		number.fun();
		System.out.println("The Size is:"+a);
    }
}