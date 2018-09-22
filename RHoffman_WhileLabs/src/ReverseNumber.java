//Ryan Hoffman - Period 5 - ReverseNumber
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		int num = 0;
		int rnum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		while (num != 0)
		{
			rnum = rnum * 10;
			rnum = rnum + num % 10;
			num = num / 10;
		}
		System.out.print("The reverse number is: " + rnum);
			

	}

}
