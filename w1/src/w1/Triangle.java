package w1;

public class Triangle {
	public static void main(String[] args) {
		double a = 12;
		double b = 23;
		double c = 20;
		double s = (a + b +c)/2;
		double area = Math.sqrt(s * (s - a) * (s  - b) * (s - c));
		System.out.println("The area of a triangle is " + area + ".");
	}

}
