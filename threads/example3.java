class first extends Thread
{
	public void run()
	{
		int i;
		for (i=0;i<=10;i++)
		{
			System.out.println("first Thread="+i);
		}
	}
}
class second extends Thread
{
	public void run()
	{
		int i;
		for (i=0;i<=10;i++)
		{
			System.out.println("Second Thread="+i);
		}
	}
}
class example3 
{
	public static void main(String args[])
	{
		first f=new first();
		second s=new second();
		f.start();
		s.start();
	}
}