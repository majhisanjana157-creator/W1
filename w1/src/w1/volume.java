package w1;
import java.util.*;

public class volume {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r = sc.nextDouble();
		
		System.out.print("Enter the height: ");
		double h = sc.nextDouble();
		
		double  vol = (22/7) * Math.pow(r,2) * h;
		System.out.println("The  volume of cyclinder is " + vol + ".");
		
	}
	
}

