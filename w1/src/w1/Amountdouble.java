package w1;
import java.util.*;
public class Amountdouble {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter dollars: ");
	        double dollars = sc.nextDouble();

	        System.out.print("Enter exchange rate: ");
	        double rate = sc.nextDouble();

	        double rupees = dollars * rate;

	        System.out.println("Converted amount: " + rupees);
	}

}
