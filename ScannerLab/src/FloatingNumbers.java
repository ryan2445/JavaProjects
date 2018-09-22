/*
 * Ryan Hoffman
 * Period 5
 */
import java.util.*;

public class FloatingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type the first number: ");
		double num1 = scan.nextDouble();
		System.out.print("Type the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("Their sum is: " + (num1 + num2));
		System.out.println("Their difference is: " + (num1 - num2));
		System.out.println("Their product is: " + (num1 * num2));

	}

}
