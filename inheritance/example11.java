class parent
{
static String a;
public static void f1(String a)
{
//s=a;
System.out.println(a);
} 
}

class child extends parent
{
static	int x;
//static int b;
public static void f1(int x)
{
//b=x;
System.out.println(x);
}
}

public class example11
{
public static void main(String args[])
{
String s;
child N=new child();	
N.f1("Rahul");
N.f1(4);
}
}
