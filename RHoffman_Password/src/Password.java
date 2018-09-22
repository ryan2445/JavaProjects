// Ryan Hoffman - Period 5 - Password Lab
import java.util.*;
public class Password {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int chances = 3;
		System.out.print("Please enter your first and last name: ");
		String fname = scan.next();
		String lname = scan.next();
		System.out.print("Enter \"1\" if you are an admin or \"2\" if you are a worker: ");
		int numb = scan.nextInt();
		System.out.print("Enter the first password: ");
		String pass1 = scan.next();
		System.out.print("Enter the second password: ");
		String pass2 = scan.next();
		if (numb == 1)
		{
		while (!pass1.equalsIgnoreCase("password1") && !pass2.equalsIgnoreCase("password2"))
			{
			System.out.print("Incorrect. Keep trying! \n");
			System.out.print("Enter the first password: ");
			pass1 = scan.next();
			System.out.print("Enter the second password: ");
			pass2 = scan.next();
			}
		if (pass1.equalsIgnoreCase("password1") || pass2.equalsIgnoreCase("password2"))
			System.out.print("Welcome back " + fname +  " " + lname + " " + "(admin)");
		}
		if (numb == 2)
		{
			while (!pass1.equals("password1") || !pass2.equals("password2"))
			{
			chances = chances - 1;
			System.out.print("Incorrect. You have " + chances + " chances left.\n");
			System.out.print("Enter the first password: ");
			pass1 = scan.next();
			System.out.print("Enter the second password: ");
			pass2 = scan.next();
			if (pass1.equals("password1") && pass2.equals("password2"))
				System.out.print("Welcome back " + fname +  " " + lname + " " + "(worker)");
			if (pass1.equals("password1") && pass2.equals("password2"))
				break;
			if (chances == 1)
				System.out.print("0 chances left.\nYou have been locked out.");
			if (chances == 1)
				break;
			}
		}
			
		
	}

}
