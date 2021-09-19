class name
{
	String a,a1,b1,a2,b2,c2;
    int x,y,z;
     void fun()
	{
		System.out.println("None");
	}
	void fun(String a)
	{
		System.out.println("One");
	}
	void fun(String a1,String b1)
	{
		System.out.println("Two");
	}
	void fun(String a2,String b2,String c2)
	{
		System.out.println("Three");
	}
	void fun(int a,int b,int c)
	{
	    x=a;
	    y=b;
	    z=c;
		System.out.println(x+""+y+""+z);
	}
}
class example1
{
	public static void main(String arg[])
	{
	name n=new name();
	n.fun();
	n.fun("A");
	n.fun("A","B");
	n.fun("A","B","C");
	n.fun(1,2,3);

    }
}