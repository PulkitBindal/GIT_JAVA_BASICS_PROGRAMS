import java.util.Scanner;
class a
{
	int pp,pq,v,sp,sq,tv,pl;
	void f3(int x, int y,int z,int c)
	{
     pp=x;
     pq=y;
     v=pp*pq;
     System.out.println("The purchased value is="+v);
     sp=z;
     sq=c;
     tv=sp*sq;
     System.out.println("The selling value is="+tv);
    }
}
class b extends a
{
	void f4()
	{
	pl=tv-v;
    System.out.println("The Profit you have is="+pl);
	}
}
class product
{
	public static void main(String[] args) 
	{
	 String n;
	 Scanner in=new Scanner(System.in);
	 b N=new b();
     System.out.println("Enter the name of Manager");
	 n=in.nextLine();
	 N.f3(50,100,150,45);
	 N.f4();		
	}
}