class A implements Runnable
{
	public void run()
	{
	int i;
	     for(i=5;i<=111;i++)
	     {
  	       System.out.println("Threads are="+i);
	     }
	}
}
class B implements Runnable 
{
	public void run()
	{
	int i;
	     for(i=5;i<=111;i++)
	      {
	      System.out.println("Threads for second are="+i);
	      }
	}
}
class threadexample
{
	public static void main(String args[])
	{
	Thread t1=new Thread(new A());
	Thread t2=new Thread(new B());
	t1.start();
	t2.start();
	}
}