import java.util.*;
public class ForLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int count = 1; count<=10; count++)
		{
			System.out.println("Count is: "+count);
		}
		System.out.print("\n");
		for (int count = 10; count>=1; count--)
		{
			System.out.println("Count is: "+count);
		}
		System.out.print("\n");
		for (int count = 1; count<=6; count++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		System.out.print("Enter a number: ");
		int numb = scan.nextInt();
		for (int count = 0; count<=numb; count+=2)
		{
			System.out.println(count);
		}
		System.out.print("\n");
		for (int count = 0; count<= 10; count++)
		{
			String comma = ", ";
			if (count==10)
				comma = "";
			System.out.print(count+comma);
		}
	}

}
