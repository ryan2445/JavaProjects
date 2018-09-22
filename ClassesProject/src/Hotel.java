//Ryan Hoffman - Custom Class - Period 5
//Purpose: Book a hotel reservation using month, first day, and last day of reservation
import java.util.*;
public class Hotel {


	public static void main(String[] args) {
		day2();
	}
	//Starts/stops code
	public static int start() {
		Scanner start2 = new Scanner(System.in);
		System.out.println("Would you like to reserve a hotel room? (1=Y/2=N)");
		int start = start2.nextInt();
		return start;
	}
	//asks for the month they want. won't work if the month is under 1 or over 12.
	public static int month() {
		int a = start();
		int month=0;
		Scanner scan = new Scanner(System.in);
		if (a==1)
		{
			System.out.println("What month would you like to reserve your hotel room for? 1-12");
			month = scan.nextInt();
		}
		else if (a==2)
		{
			System.out.println("Hope to see you soon!");
			System.exit(0);
		}
		else
		{
			System.out.println("You did not enter \"Y\" or \"N\"");
			System.exit(0);
		}
		
		return month;
	}
	//displays how many days in the month they chose. asks for the first day of the reservation.
	//won't work if the day is under or over the amount of days in that month 
	public static int day1() {
		Scanner scan2 = new Scanner(System.in);
		int day = 0;
		int month = month();
		if (month == 1)
		{
		System.out.println("There are 31 days in January. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>31)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 2)
		{
		System.out.println("There are 28 days in February. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>28)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 3)
		{
		System.out.println("There are 31 days in March. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>31)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 4)
		{
		System.out.println("There are 30 days in April. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>30)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 5)
		{
		System.out.println("There are 31 days in May. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>31)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 6)
		{
		System.out.println("There are 30 days in June. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>30)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 7)
		{
		System.out.println("There are 31 days in July. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>31)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 8)
		{
		System.out.println("There are 31 days in August. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>31)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 9)
		{
		System.out.println("There are 30 days in September. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>30)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 10)
		{
		System.out.println("There are 31 days in October. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>31)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 11)
		{
		System.out.println("There are 30 days in November. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>30)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else if (month == 12)
		{
		System.out.println("There are 31 days in December. Enter the first day of your reservation");
		day = scan2.nextInt();
		if (day<1||day>31)
		{
			System.out.print("You didn't enter a correct day");
			System.exit(0);
		}
		}
		else 
		{
			System.out.print("You did not enter a correct month");
			System.exit(0);
		}
		return day;
	}
	
	//asks for the last day of their reservation
	//won't work if the last day is less than the first day.
	//displays the first and last day of their trip and how long the trip is. 
	//The other highlighted code is from me spending 6 hours trying to get the month to display along with the first and last day along with 
	//other rules and exceptions
	public static int day2() {
		Scanner scan3 = new Scanner(System.in);
		int day2 = 0;
		int day1 = day1();
		//if (month == 1)
		//{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>31)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day.");
			System.exit(0);
		}
   /*		}
		else if (month == 2)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>28)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month == 3)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>31)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month == 4)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>30)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month ==5)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>31)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month == 6)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>30)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month == 7)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>31)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month == 8)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>31)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month ==9)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>30)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month ==10)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>31)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month ==11)
		{
		System.out.println("Enter the LAST day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>30)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		else if (month==12)
		{
		System.out.println("Enter the SECOND day of your reservation");
		day2 = scan3.nextInt();
		if (day2<1||day2>31)
		{
			System.out.print("You didn't pick a correct day.");
			System.exit(0);
		}
		if (day1>day2)
		{
			System.out.print("Your first reservation day is earlier than your last reservation day");
			System.exit(0);
		}
		}
		*/
		System.out.println("Your reservation has been booked from the "+day1+" to the "+day2+".");
		System.out.print("Your reservation is "+((day2-day1)+1)+" days long!");
		return day2;
	}

}
