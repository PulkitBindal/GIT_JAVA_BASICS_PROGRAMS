import java.util.Scanner;
import java.io.*;

public class reverseandsubtraction{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int reverse=0;
		int number = sc.nextInt();
		int temp = number;
		while(temp!=0){
			int remainder = temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		System.out.println(number-reverse);
	}
}