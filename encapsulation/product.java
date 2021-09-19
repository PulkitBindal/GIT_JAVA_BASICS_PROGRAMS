import java.util.Scanner;
class number
{
	String pn,pc;
	int pq,pp,v,sq,sp,sv,stq,stv,opl,pl;
	void input(String a,String b,int p,int q, int ssq,int ssp )
	{
		pn=a;
		pc=b;
		pq=q;
		pp=p;
		sq=ssq;
		sp=ssp;
	}
	void process()
	{
		v=pq*pp;
		sv=sq*sp;
		stq=pq-sq;
		stv=stq*pp;
		opl=sp-pp;
		pl=sq*opl;
	}
	void show()
	{	System.out.println("-----Purchase Invoice------");
		System.out.println("Name="+pn);
		System.out.println("Code="+pc);
		System.out.println("Quantity="+pq);
		System.out.println("Price="+pp);
		System.out.println("Value Rs.="+v);
		System.out.println("\n\n");
		System.out.println("------Sales Invoice--------");
		System.out.println("Sales Quantity="+sq);
		System.out.println("Sales Price Rs.="+sp);
		System.out.println("Sales Value Rs.="+sv);
		System.out.println("\n\n");
		System.out.println("------Invoice of Stock------");
		System.out.println("Stock Quantity="+stq);
		System.out.println("Stock Value Rs.="+stv);
		System.out.println("\n\n");
		System.out.println("------Profit Invoice--------");
		System.out.println("One Product Proift Loss Rs.="+opl);
		System.out.println("All Product Profit or Loss Rs.="+pl);


}
}
class product
{
	public static void main(String args[])
	{
		number n=new number();

		Scanner in=new Scanner(System.in);
		String pn,pc;
		int pq,pp,sq,sp;
		int n1,i=1;
		System.out.println("Enter the customer no");
		n1=in.nextInt();
		while(i<=n1)
		{
		System.out.println("Enter the Product Name & Code");
		pn=in.nextLine();
		pc=in.nextLine();

	
		System.out.println("Enter the purchase quantity & price");
		pq=in.nextInt();
		pp=in.nextInt();
		System.out.println("Enter the Sales Quantity & price");
		sq=in.nextInt();
		sp=in.nextInt();
		n.input(pn,pc,pq,pp,sq,sp);
		n.process();
		n.show();
		
	i++;
	}	
		/*n.input("Soap","Persona",12,47,3,55);
		n.process();
		n.show();
		n.input("Mouse","Dell",41,625,25,689);
		n.process();
		n.show();*/
	}
}