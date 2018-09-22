// Ryan Hoffman - Period 5 - ChangeTendered (ChangeLab)
import java.util.*;
public class ChangeTendered {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What was the purchase price (exclude dollar sign)?");
		double purchaseprice = scan.nextDouble();
		System.out.println("How much money did you pay with (exclude dollar sign)?");
		double payed = scan.nextDouble();
		System.out.printf("The purchase price was $%.2f" + "\n", purchaseprice);
		System.out.printf("You paid $%.2f" + "\n", payed);
		double change = payed - purchaseprice;
		System.out.printf("You received $%.2f in change" + "\n", change);
		int hundreddollars = 0;
		int fiftydollars = 0;
		int twentydollars = 0;
		int tendollars = 0;
		int fivedollars = 0;
		int onedollar = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		hundreddollars = (int) (change/100);
		change = change - hundreddollars *100;
		fiftydollars = (int) (change/50);
		change = change - fiftydollars * 50;
		twentydollars = (int) (change/20);
		change = change - twentydollars * 20;
		tendollars = (int) (change/10);
		change = change - tendollars * 10;
		fivedollars = (int) (change/5);
		change = change - fivedollars * 5;
		onedollar = (int) (change/1);
		change = change - onedollar * 1;
		quarter = (int) (change/.25);
		change = change - quarter * .25;
		dime = (int) (change/.10);
		change = change - dime * .10;
		nickel = (int) (change/.05);
		change = change - nickel * .05;
		penny = (int) (change/.01);
		change = change - penny * .01;
		System.out.printf(hundreddollars + " one hundred dollar bill(s)\n");
		System.out.printf(fiftydollars + " fifty dollar bill(s)\n");
		System.out.printf(twentydollars + " twenty dollar bill(s)\n");
		System.out.printf(tendollars + " ten dollar bill(s)\n");
		System.out.printf(fivedollars + " five dollar bill(s)\n");
		System.out.printf(onedollar + " one dollar bill(s)\n");
		System.out.printf(quarter + " quarter(s)\n");
		System.out.printf(dime + " dime(s)\n");
		System.out.printf(nickel + " nickel(s)\n");
		System.out.printf(penny + " penny/pennies\n");
		
	}

}
