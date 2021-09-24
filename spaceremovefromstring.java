import java.util.*;
import java.io.*;
import java.lang.*;

public class spaceremovefromstring{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Before space removal:"+str);
		str = str.replaceAll("\\s","");
		System.out.println("After space removal:"+str);
		int len = str.length();
		double lensr = Math.sqrt(len);
		System.out.println("Original Length Of the String:"+len);
		System.out.println("Square Root Value:"+lensr);
		double ceil = Math.ceil(lensr); // width
		double floor = Math.floor(lensr); // height
		double area = ceil*floor;
		double difference = len-area;
		System.out.println("Ceil Value(Width):"+ceil);
		System.out.println("Floor Value(Height):"+floor);
		System.out.println("Area will be:"+area);
		if(len>area){
			System.out.println("You have to increase the height by "+difference+ " in order to make the area equal to or greater than the length of the string." );
		}
		else {
			System.out.println("Length of the string and Area is Equal.");
		}

	}
}