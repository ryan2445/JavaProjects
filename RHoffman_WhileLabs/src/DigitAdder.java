//Ryan Hoffman - Period 5 - DigitAdder
import java.util.*;
public class DigitAdder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int numb2 = 0;
		System.out.println("Enter a number: ");
		int numb = scan.nextInt();
		while (numb > 0)
		{
			sum = sum + numb % 10;
			numb = numb / 10;
		}
		System.out.print(sum + " is the sum of your digits");
	}

}
