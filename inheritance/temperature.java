class farenheit
{
	int ft;
	void fun2(int a)
	{
		ft=a;
		System.out.println("The temperature in farenheit entered by you is="+ft);
	}
}
class conversion extends farenheit
{
	int ct;
	void fun3()
	{
	ct=(ft-32)*5/9;
	System.out.println("The temperature in celcius is="+ct);
    }
}
class temperature
{
	public static void main(String args[])
	{
		conversion N=new conversion();
		N.fun2(101);
		N.fun3();
		}
}