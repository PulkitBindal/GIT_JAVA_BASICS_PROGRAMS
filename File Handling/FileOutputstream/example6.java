import java.io.*;
class example6
{
	public static void main(String args[])throws IOException
	{
        int i;
		FileOutputStream fout;
		fout=new FileOutputStream("./pulkit.txt",false);
		String s="Hello World";
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
        fout.write(ch[i]);
        fout.close();
	}
}