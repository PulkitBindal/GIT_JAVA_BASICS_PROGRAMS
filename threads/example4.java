class first extends Thread
{
	public void fun()
	{
		int a,b,c;
		a=34;
		b=31;
		c=a+b;
		System.out.println("The sum of the numbers are="+c);

	}
}
class second extends Thread
//class second implements Runnable 
{
	public void fun()
	{

		int i;
		for (i=0;i<=10;i++)
		{
			System.out.println("Her is the thread="+i);
        }
	}
}
class example4
{
	public static void main(String args[])
	{
		first f1=new first();
		second s1=new second();
		/*Thread t1=new Thread(new first());
		//s1.start();
		//Thread t2=new Thread(new second());
	
		//t1.start();0
		//t2.start();*/
		s1.fun();
		f1.fun();
	}
}