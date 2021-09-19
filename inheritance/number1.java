package NUMBER;
public class number1
{
	public int x,y,z;
	int big;
	public void input(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	public void check()
	{
		if(x>y&&x>z)
			big=x;
		else if(y>x&&y>z)
			big=y;
		else
			big=z;
	}
	public void output()
	{
		System.out.println("This is greates number"+big);
	}
}