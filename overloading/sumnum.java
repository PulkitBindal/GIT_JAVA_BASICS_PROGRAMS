class abc
{
	int a,b,c;
	void f11(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
	  System.out.println(c);
	}
class msg extends abc
{
	int m,n,o,p;
	void f11(int x,int y)
	{
		m=x;
		n=y;
		o=4;
		p=m+n+o;
		System.out.println(p);
	}

}
class example2
{
	public static void main(String[] args) 
	{
		msg N=new msg();
		N.f11(2,3);
		N.f11(3,4);
	}
}