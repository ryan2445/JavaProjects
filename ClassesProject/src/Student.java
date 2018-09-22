//Ryan Hoffman - Student Class - Period 5
//Purpose: Calculate how much sleep you'll get based on the time you start homework, how long you do homework, and the time you wake up.
import java.util.Scanner;
public class Student {

public static void main(String[] args) {
	int a = last();
	System.out.println("If you go to sleep right after you finish homework, \nyou will get about "+a+" hours of sleep tonight.");

}
//asks what time you will start your homework
public static int starthw() {
	Scanner scan3 = new Scanner(System.in);
	System.out.println("What time will you start your homework after school? \n[Enter an int between 4(pm) and 12(am)]");
	int timestart = scan3.nextInt();
	System.out.println("You will start your homework at "+timestart+"pm.\n");
	if (timestart<4||timestart>12)
	{
		System.out.print("That is not a valid time. Please re-run the program and try again.");
		System.exit(0);
	}
	return timestart;
}
//asks how many hours you'll work on homework
public static int hwHours(){
	Scanner scan = new Scanner(System.in);
	System.out.println("How many hours will you work on homework tonight?");
	int hwHours = scan.nextInt();
	System.out.println("");
	return hwHours;
}
//asks what time you'll wake up
	public static int timewakeup() {
		Scanner scan4 = new Scanner(System.in);
		System.out.println("What time will you wake up?\n[Enter an int between 1(am) and 9(am)]");
		int timewakeup = scan4.nextInt();
		if (timewakeup<1||timewakeup>9)
		{
			System.out.print("That is not a valid time. Please re-run the program and try again.");
			System.exit(0);
		}
		System.out.println("You will wake up at "+timewakeup+"am.\n");
		return timewakeup;
	}
//calculates how many hours until 12.00am after you finish your homework
	//calculates how many more hours after 12.00am until you wake up
	//adds them together and tells you how many hours of sleep you will get
public static int last(){
	int d = starthw();
	int b = hwHours();
	int e = timewakeup();
	int finalhours = d+b;
	int f2=0;
	int last = 0;
	if(finalhours>=4&&finalhours<=12)
	{
	for(int f=finalhours;f<12;f++)
	{
		f2++;
	}
	last = f2+e;
	}
	else if (finalhours>12)
	{
		int temp1 = finalhours-12;
		last = e-temp1;
	}
	return last;	
}

}

