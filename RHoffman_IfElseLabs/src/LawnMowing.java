// Ryan Hoffman - Period 5 - IfElseLabs (LawnMowing)
import java.util.*;
public class LawnMowing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the lawn: \n");
		int length = scan.nextInt();
		System.out.print("Enter the width of the lawn: \n");
		int width = scan.nextInt();
		System.out.print("Choose which way you want to pay: \n (1) Once per season \n (2) Twice per season \n (3) 20 times per year \n");
		int option = scan.nextInt();
		int area = length * width;
		int fee = 0;
		int fee2 = 0;
		int seasonprice = 0;
		if (area < 400)
			fee = 25;
		else
			if ((area >= 400) && (area < 600))
				fee = 35;
			else
				if (area >= 600)
					fee = 50;
		if (option == 1)
			fee2 = fee * 20;
		else
			if (option == 2)
				fee2 = fee * 10 + 5;
			else
				if (option == 3)
					fee2 = fee + 3;
		if (option == 1)
			seasonprice = fee * 20;
		else
			if (option == 2)
				seasonprice = fee * 20 + 10;
			else
				if (option == 3)
					seasonprice = fee * 20 + 60;
		System.out.print("Based on your selected payment schedule, your payment for a lot of " + area + " square feet is $" + fee2 + ". Seasonal fee is $" + seasonprice + ".");
			

	}

}
