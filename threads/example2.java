class Number implements Runnable
{
   public void run()
   {
   	int i;
   	for(i=0;i<=10;i++)
   	{
   		System.out.println("First thread is="+i);
   	}
   }
}
class square implements Runnable
{
	public void run()
	{
		int i,r;
		for(i=0;i<=10;i++)
		{
			r=i*i;
			System.out.println("Second threads is="+r);
		}
	}
}
class simple implements Runnable
{
	public void run()
	{
		int p,r,i,si;
		{
			for(i=0;i<15;i++)
			{
				p=2000;
				r=5;
				si=(p*r*i)/100;
				System.out.println("The simple interest for next 15 years is="+si);
			} 
		}
	}
}
class example2
{
	public static void main(String[] args) 
	{
    Thread t1=new Thread(new Number());
    Thread t2=new Thread(new square());
    Thread t3=new Thread(new simple());
    t1.start();
    t2.start();
    t3.start();
	}
}