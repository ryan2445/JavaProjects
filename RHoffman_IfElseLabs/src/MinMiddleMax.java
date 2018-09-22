// Ryan Hoffman - Period 5 - IfElseLabs (MinMiddleMax)
import java.util.*;
public class MinMiddleMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = scan.nextInt();
		int min = 0;
		int mid = 0;
		int max = 0;
		
		if (num1 < num2 && num1 < num3)
			min = num1;
		else
			if (num2 < num1 && num2 < num3)
				min = num2;
			else
				if (num3 < num1 && num3 < num2)
					min = num3;
		
		if (num1 < num2 && num1 > num3 || num1 > num2 && num1 < num3)
			mid = num1;
		else
			if (num2 < num1 && num2 > num3 || num2 > num1 && num2 < num3)
				mid = num2;
			else
				if (num3 < num1 && num3 > num2 || num3 > num1 && num3 < num2)
					mid = num3;
		
		if (num1 > num2 && num1 > num3)
			max = num1;
		else
			if (num2 > num1 && num2 > num3)
				max = num2;
			else
				if (num3 > num1 && num3 > num2)
					max = num3;
		System.out.println("Min: " + min + ", Mid: " + mid + ", Max: " + max);
	}

}
