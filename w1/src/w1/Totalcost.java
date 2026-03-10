package w1;
import java.util.*;
public class Totalcost {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

	        System.out.print("Enter price per item: ");
	        double price = sc.nextDouble();

	        double total = quantity * price;

	        System.out.println("Total Cost: " + total);
	}

}
