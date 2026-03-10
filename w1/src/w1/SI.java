package w1;
import java.util.*;
public class SI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		double P = sc.nextDouble();
		
		System.out.print("Enter the the rate of interest: ");
		double R =  sc.nextDouble();
		
		System.out.print("Enter the time: ");
		double T = sc.nextDouble();
		
		double SI  = (P * T * R)/100;
		System.out.println("The Simple Interest is " + SI + ".");
	} 

}
