import java.io.*;
class example7
{
	public static void main(String args[])throws IOException
	{
		int i;
		FileOutputStream fout;
		fout=new FileOutputStream("./pulkit1.txt",true);
		String s="Hello Everyone present here";
		char ch[]=s.toCharArray();
		for(i=0;i<=s.length();i++)
		fout.write(ch[i]);
		fout.close();
	}
}
/*import java.io.*;
class example75
{
	public static void main(String args[])throws IOException
	{
		int i;
		FileOutputStream fout;
		fout=new FileOutputStream("./pulkit2.docs",true);
		String s="Welcome Everyone";
		char ch[]=s.toCharArray();
		for(i=0;i<=s.length();i++)
		fout.write(ch[i]);
		fout.close(); 
	}
}*/