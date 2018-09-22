//Ryan Hoffman - Period 5 - GCD Lab
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prod1;
		int prod2;

		System.out.print("Enter a number: ");
		int i1 = scan.nextInt();
		System.out.print("Enter a second number: ");
		int i2 = scan.nextInt();
		for (int counter = 1; counter>=1; counter++)
		{
			int final1;
			int final2;
			prod1 = i1/counter;
			prod2 = i2/counter;
			if (prod1==0 || prod2 ==0)
			{
				System.out.print("The GCD of "+i1+" and "+i2+" is "+(counter-1));
				break;
			}
		}
	}
}
