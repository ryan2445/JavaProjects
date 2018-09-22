// Ryan Hoffman - Period 5 - Change Lab Conversion
import java.util.*;
public class JarChange {
	
	public static void main(String[] args) {
		int q1 = quarters();
		int d1 = dimes();
		int n1  = nickels();
		int p1 = pennies();
		calc(q1, d1, n1, p1);
	}
	public static void calc(int quarters, int dimes, int nickels, int pennies) {
		int qp = quarters * 25;
		int dp = dimes * 10;
		int np = nickels * 5;
		int p = pennies;
		int dollars = (qp + dp + np + p) / 100;
		int cents = (qp + dp + np + p) % 100;
		display(dollars, cents);
	}
	public static void display(int dollars, int cents) {
		System.out.print("Total value: "+dollars +" dollars and " +cents+" cents.");
	}
	public static int quarters(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of quarters: ");
		int quarters = scan.nextInt();
		return quarters;
	}
	public static int dimes(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of dimes: ");
		int dimes = scan.nextInt();
		return dimes;
	}
	public static int nickels(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of nickels: ");
		int nickels = scan.nextInt();
		return nickels;
	}
	public static int pennies(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of pennies: ");
		int pennies = scan.nextInt();
		return pennies;
	}
}
