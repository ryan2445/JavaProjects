
public class Payroll {

	public static void main(String[] args) {
		int hourlyrate = 20;
		int hoursworked = 50;
		int grosspay = hourlyrate * hoursworked;
		double withholding = grosspay * .15;
		double netpay = grosspay - withholding;
		System.out.print("Gross Pay: $");
		System.out.print(grosspay);
		System.out.print(" Withholding Tax: $");
		System.out.print(withholding);
		System.out.print(" Net Pay: $");
		System.out.print(netpay);

	}

}
