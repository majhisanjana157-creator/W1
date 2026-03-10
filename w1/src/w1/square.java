package w1;
import java.util.*;

public class square {
	public static void  main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double l = sc.nextDouble();
		double area = Math.pow(l, 2);
		
		System.out.println("The  area of square is " + area + ".");
		
	}

}
