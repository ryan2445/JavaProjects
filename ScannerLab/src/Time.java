/*
 * Ryan Hoffman
 * Period 5
 */
import java.util.*;
public class Time {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of hours: ");
		int hours = scan.nextInt();
		System.out.print("Enter the number of minutes: ");
		int minutes = scan.nextInt();
		System.out.print("Enter the number of seconds: ");
		int seconds = scan.nextInt();
		int hts = hours * 3600;
		int mts = minutes * 60;
		int totalseconds = hts + mts + seconds;
		System.out.print("\n" + "Total seconds: " + totalseconds);
		
	}

}
