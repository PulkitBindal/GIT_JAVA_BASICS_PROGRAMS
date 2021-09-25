import java.util.*;
import java.io.*;


public class firstmaxsecondmax { 
    public static void main(String args[]) 
    { 
        int tc,first,second,max,smax;
        Scanner sc =new Scanner(System.in);
        tc=sc.nextInt();
        first=sc.nextInt();
        int[] A = new int[100];
        int[] B = new int[100]; 
        for(int i=0;i<first;i++)
        {
            A[i]=sc.nextInt();
        }
        second=sc.nextInt();
        for(int i=0;i<second;i++)
        {
            B[i]=sc.nextInt();

        }
        for(int i=0;i<first;i++)
        {
            System.out.println(A[i]);
        }
        for(int i=0;i<second;i++)
        {
            System.out.println(B[i]);
        }
        max=A[0];
        smax=A[1];
        for(int i =0;i<first;i++)
        {
            if(max<A[i])
            {
                max=A[i];
                smax=A[i-1];

            }
            else
            {}
        }
        System.out.println("First Max in First Array:"+max);
        System.out.println("Second Max in First Array:"+smax);


    } 
}