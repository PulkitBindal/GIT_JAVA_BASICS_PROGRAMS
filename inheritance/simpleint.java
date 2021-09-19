class year
{
	int p,r,t,si;
	void f1(int a,int b,int c)
	{ 
      p=a;
      r=b;
      t=c;
      si=(p*r*t)/100;
      System.out.println("Simple interest in reference to year is="+si);
	}
}
class month extends year 
{
	void f2()
	{
		si=(p*r*t)/100*12;
		System.out.println("Simple interest in reference to month is="+si);
	}
}
class days extends month
{
	void f3()
	{
		si=(p*r*t)/100*365;
		System.out.println("Simple interest in reference to days="+si);
	}
}
class simpleint
{
     public static void main(String[] args) 
     {
		days in=new days();
		in.f1(5000,3,5);
	    in.f2();
		in.f3();

	}
}







