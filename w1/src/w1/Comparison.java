package w1;

public class Comparison {
	public static void main(String[]args) {
        boolean result;
		
		result = ((5 > 3) && (8 > 5));
		System.out.println("Logical AND ((5 > 3) && (8 > 5)): " + result);
		
		result = ((5 > 3) || (2 > 5));
		System.out.println("Logical OR ((5 > 3) || (2 > 5)): " + result);
		
		result = (!(5 == 10));
		System.out.println("Logical NOT (!(5 == 10)): " + result);
		
		double a = 6.1;
		double b = 3;
		System.out.println("a > b: " + (a > b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a >= b: " + (a >= b));
		System.out.println("a <= b: " + (a <= b));
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
	}

}
