import java.io.*;
class example1
{
	public static void main(String[] args)throws IOException
	 {
		int i;
		FileInputStream fin;
		fin=new FileInputStream("e:/java 2/File Handling/pulkit.txt");
		do
		{
			i=fin.read();
			if(i!=-1)		
            System.out.println((char)i);   
	}
       while(i!=-1);
       fin.close();
	}
}