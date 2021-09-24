import java.util.*;
import java.io.*;

public class sumofarray{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int sum=0;
		int[] A = new int[100];
		System.out.println("Enter the Size of Array:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
			sum=sum+A[i];
		}
		System.out.println("The Sum of the array is:" + sum);
	}
}