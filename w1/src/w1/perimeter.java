package w1;
import java.util.*;
public class perimeter {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double l = sc.nextDouble();
		System.out.print("Enter the breadth: ");
		double b = sc.nextDouble();
		
		double perimeter = 2 * (l + b);
		
		System.out.println("The perimeter of  rectangle is " + perimeter + ".");
		
		
	}

}
