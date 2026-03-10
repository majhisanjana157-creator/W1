package w1;
import java.util.*;
public class Kilometer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();

        double km = miles * 1.609;

        System.out.println("Kilometers: " + km);
	}
	

}
