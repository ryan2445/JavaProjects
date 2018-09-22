//Ryan Hoffman - Period 5 - Rock Paper Scissors
import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		int cpu2=cpu();
		String user2=user();
		//user();
		System.out.print("You chose: ");
		if (user2.equalsIgnoreCase("rock"))
			System.out.println(user2);
		else if (user2.equalsIgnoreCase("paper"))
			System.out.println(user2);
		else if (user2.equalsIgnoreCase("scissors"))
			System.out.println(user2);
		else
			System.out.println("Nothing.");
		System.out.print("The computer chose: ");
		if (cpu2==1)
			System.out.println("rock.");
		else if (cpu2==2)
			System.out.println("paper.");
		else if (cpu2==3)
			System.out.println("scissors.");
		
		if (cpu2==1 && user2.equalsIgnoreCase("rock"))
			System.out.print("It's a tie!");
		if (cpu2==1 && user2.equalsIgnoreCase("paper"))
			System.out.print("You win!");
		if (cpu2==1 && user2.equalsIgnoreCase("scissors"))
			System.out.print("You lose!");
		
		
		if (cpu2==2 && user2.equalsIgnoreCase("paper"))
			System.out.print("It's a tie!");
		if (cpu2==2 && user2.equalsIgnoreCase("scissors"))
			System.out.print("You win!");
		if (cpu2==2 && user2.equalsIgnoreCase("rock"))
			System.out.print("You lose!");
		

		if (cpu2==3 && user2.equalsIgnoreCase("scissors"))
			System.out.print("It's a tie!");
		if (cpu2==3 && user2.equalsIgnoreCase("rock"))
			System.out.print("You win!");
		if (cpu2==3 && user2.equalsIgnoreCase("paper"))
			System.out.print("You lose!");
	}
	public static String user(){
		System.out.println("Enter \"rock\", \"paper\", or \"scissors\":");
		Scanner scan = new Scanner(System.in);
		String user2 = scan.next();
		return user2;
	}
	public static int cpu(){
		int cpu = (int)(3*Math.random() + 1);
		return cpu;
	}

}
