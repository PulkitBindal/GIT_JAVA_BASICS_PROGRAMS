import java.io.*;
class example8
{
	public static void main(String args[])throws IOException
	{
		int i;
		FileOutputStream fout;
		fout =new FileOutputStream("./pulkit4.txt",true);
		String s1="My name is Pulkit";
		char ch[]=s1.toCharArray();
		for(i=0;i<=s1.length();i++)
			fout.write(ch[i]);
	        fout.close();
	}
}