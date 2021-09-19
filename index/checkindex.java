class checkindex
{
	public static void main(String args[])
	{
	int k;
	String a="Aditya";
	String b="Chirag";
	String c="Nivesh";
	String d="Retik";
    String e="Manish";
	int f=a.indexOf("A");
	int g=b.indexOf("h");
	int h=c.indexOf("v");
	int i=d.indexOf("i");
    int j=e.indexOf("s");
	System.out.println(f);
	System.out.println(".....................................");
	System.out.println(g);
	System.out.println(".....................................");
	System.out.println(h);
	System.out.println(".....................................");
	System.out.println(i);
	System.out.println(".....................................");
	System.out.println(j);
	System.out.println(".....................................");
	k=f+g+h+i+j;
	System.out.println("The summation of all the index is="+k);
	System.out.println(".....................................");
	if(k%2==0)
	System.out.println("The index is even number");
    else
    System.out.println("The index is odd number");
    System.out.println(".....................................");
    if(j>i&&i>h&&h>g&&g>f)
    System.out.println("The numbers are in increasing order");
    else  
    System.out.println("The numbers are in decreasing order"); 
    System.out.println(".....................................");
    }
}