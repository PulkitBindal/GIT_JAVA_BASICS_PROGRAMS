import java.io.*;
//import java.io.File;
//import java.io.IOException;
class example4
{
	public static void main(String args[])throws IOException
	{	
	File f1=new File("e:/tech/pulkit.txt");
	f1.createNewFile();
	System.out.println("is file exist : "+f1.exists());
	}
}