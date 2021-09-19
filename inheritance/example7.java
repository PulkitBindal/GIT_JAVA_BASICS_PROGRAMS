package ALL;
import google.traingle;
import java.util.Scanner;

	class example7
	{
		public static void main(String agr[])
		{
			traingle t=new traingle();
			Scanner in=new Scanner(System.in);
			int a,b,c;
			System.out.println("Enter any three number");
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			t.input(a,b,c);
			t.check();
			t.output();
			t.show();

		}
	}
