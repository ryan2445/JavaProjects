/*
 * Ryan Hoffman
 * Period 5
 */
import java.util.*;
public class Payroll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your first and last name: ");
		String fname = scan.next();
		String lname = scan.next();
		System.out.print("Please enter your hourly rate: ");
		double rate = scan.nextDouble();
		System.out.print("Please enter your hours worked: ");
		double hours = scan.nextDouble();
		double tax = .28;
		double grosspay = hours * rate;
		double netpay = grosspay - (grosspay * tax);
		System.out.print("\n" + fname + lname + "\n \n" + "My hourly rate is: $" + rate + 
				"\n" + "I worked this many hours: " + hours
				+ "\n" + "My net pay is: $" + netpay);
		

	}

}
