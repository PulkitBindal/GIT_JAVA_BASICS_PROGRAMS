import java.io.*;
class example5
{
public static void main(String args[])throws IOException 
{
int i;
FileOutputStream fout;
fout=new FileOutputStream("./Muzahid.txt",true);
String s="Thanks";
char ch[]=s.toCharArray();
for(i=0;i<s.length();i++)
fout.write(ch[i]);
fout.close();
} 
}