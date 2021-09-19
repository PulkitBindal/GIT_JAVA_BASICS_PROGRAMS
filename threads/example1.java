class A implements Runnable
{
	public void run()
	{
		int i;
		for (i=0;i<=10;i++)
		{
			System.out.println("Thread First is :"+i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Threads Second is :"+i);
		}
	}
}
class C implements Runnable
{
	public void run()
	{
		int a,b,c;
        a=2;
        b=4;
        c=a+b;
        System.out.println("The sum of the two give evalues are="+c);
       	}
}
class example1
{
	public static void main(String rags[])
	{
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		Thread t3=new Thread(new C());
		t1.start();
		t3.start();
		t2.start();
	}
}