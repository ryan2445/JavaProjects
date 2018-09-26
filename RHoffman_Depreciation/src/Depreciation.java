//Ryan Hoffman - AP Java Period 5 - Depreciation Lab
import java.util.*;
public class Depreciation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String product = "";
		double cost = 0;
		double dep = 0;
		double olddep = 0; 
		double life = 0;
		System.out.println("What is your product?");
		product = scan.next();
		System.out.println("What is the year of purchase?");
		int oyear = scan.nextInt();
		int year = oyear;
		System.out.println("What is the cost?");
		cost = scan.nextDouble();
		System.out.println("What is the estimated life?");
		life = scan.nextInt();
		System.out.println("Type (1) for straight line or (2) for double-decline:");
		int method = scan.nextInt();
		System.out.println("Description: "+product);
		System.out.println("Year of purchase: "+year);
		System.out.println("Cost of purchase: $"+cost);
		System.out.println("Estimated life: "+(int)life+" years");
		if (method ==1)
		System.out.println("Method of depreciation: Straight Line");
		else 
			System.out.println("Method of depreciation: Double-Decline");
		if (method == 1)
		{
			System.out.println("Year\tValue at Beginning of Year\t\t"
					+ "Amount Depreciation During Year\t\tTotal Depreciation at End of Year");
			while (year < (oyear+5))
			{
			year = (year + 1);
			olddep = dep+olddep;
			dep = cost * (1/life);
			if (year == (oyear+5))
				dep=cost;
			System.out.format("%-8d" + "$%-39.2f" + "$%-39.2f" + "$%-42.2f%n", year, cost, dep, (dep+olddep));
			cost = cost - dep;
			}
		}
		if (method == 2)
		{
			System.out.println("Year\tValue at Beginning of Year\t\t"
					+ "Amount Depreciation During Year\t\tTotal Depreciation at End of Year");
			while (year < (oyear+5))
			{
			year = (year + 1);
			olddep = dep+olddep;
			dep = cost * (2/life);
			if (year == (oyear+5))
				dep=cost;
			System.out.format("%-8d" + "$%-39.2f" + "$%-39.2f" + "$%-42.2f%n", year, cost, dep, (dep+olddep));
			cost = cost - dep;
			}
			
		}

	}
}
