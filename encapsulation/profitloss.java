import java.util.Scanner;
class number
{
	int pq,pp,v,sp,sq,sv,stq,stv,opl,pl;
	String pn,pc;
	void show(String f,String e,int a,int b,int c,int d)
	{
		pq=a;
		pp=b;
		sq=c;
		sp=d;
		pn=e;
		pc=f;
	}
    void fun()
    {
    	v=pq*pp;
    	sv=sq*sp;
    	stq=pq-sq;
    	stv=stq*pp;
    	System.out.println("product name is"+pn);
    	System.out.println("product company is"+pc);
System.out.println("product quantity is"+pq);
System.out.println("product price is"+pp);
System.out.println("value="+v);
System.out.println("sales quantity"+sq);
System.out.println("sales price"+sp);
System.out.println("sales value"+sv);
System.out.println("sales total quantity"+stq);
System.out.println("sales total value"+stv);
    }
}
    class profitloss
    {
    	public static void main(String s[])
    	{
    		Scanner obj=new Scanner(System.in);
    		number n=new number();
    		System.out.println("product name is");
    		n.pn=obj.nextLine();
    	System.out.println("product company is");
    	String pc=obj.nextLine();
System.out.println("product quantity is");
int pq=obj.nextInt();
System.out.println("product price is");
int pp=obj.nextInt();
System.out.println("sales quantity");
int sq=obj.nextInt();
System.out.println("sales price");
int sp=obj.nextInt();
//System.out.println("sales total quantity"+stq);
//System.out.println("sales total value"+stv);
n.show(n.pn,pc,pq,pp,sq,sp);
n.fun();

    	}
    }
