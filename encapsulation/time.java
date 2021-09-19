import java.util.Scanner;
class time
{
	public static void main(String args[])
	{
		int p1,p2,p3,seconds;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Seconds");
		seconds = in.nextInt();
		p1 = seconds%60;//remainder
		p2 = seconds/60;// minute
		p3 = p2%60;//remainder
        p2 = p2/60;//hour
		System.out.print("HH:MM:SS**" +p2 + ":" + p3 + ":" + p1);

    }
}