package print;
class a
{
	int a;
}
class b extends a
{
	void fun()
	{
	a=345;
    System.out.println(a);
    }
}
class print 
{
	public static void main(String x[])
	{
		b in=new b();
		in.fun();

	}
}