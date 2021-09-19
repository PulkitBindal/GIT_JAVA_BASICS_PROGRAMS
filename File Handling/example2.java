import java.io.File;
class exists
{
	public static void main(String args[])
	{
		File f1=new File("IMG_20190614_193640.jpg");
		File f2=new File("download.jpeg");
		System.out.println("Is file location is correct:"+f1.exists());
		System.out.println("Is file location is correct: "+f2.exists());
	}
}
