package pppp;
import tech.example9;
class example10 extends example9
{
	public void show(int m,int n)
	{
      rollno=m;
      salary=n;
	System.out.println(rollno);
	System.out.println(salary);
    }
}
class student
{
	public static void main(String args[])
   {
   	int a,b,m,n;
   	m=5;
   	n=6;
   	example10 N=new example10();
   	N.input("rahul","bajaj");
   	N.output();
   	N.show(m,n);
   }
}