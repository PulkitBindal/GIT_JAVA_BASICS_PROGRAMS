class sumsub
{
	int a,b,c;
	void fun(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("Summation="+c);
	}
}
class sub extends sumsub
{
  int sub;
  void fun2()
  {
  	sub=a-b;
  	System.out.println("Subtraction="+sub);
  }
}
class example6
{
	public static void main(String args[])
	{
		sub obj=new sub();
        obj.fun(10,5);
		obj.fun2();
	}
}