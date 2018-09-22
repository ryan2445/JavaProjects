// Ryan Hoffman - Period 5 - IfElseLabs (Triangles)
import java.util.*;
public class Triangles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the first side: ");
		int side1 = scan.nextInt();
		System.out.println("Enter the length of the second side: ");
		int side2 = scan.nextInt();
		System.out.println("Enter the length of the third side: ");
		int side3 = scan.nextInt();
		String triangle = "";
		if (side1 == side2 && side1 == side3 && side2 == side1 && side2 == side3 && side3 == side1 && side3 == side2)
			triangle = "equilateral";
		else
			if (side1 != side2 && side1 != side3 && side2 != side1 && side2 != side3 && side3 != side1 && side3 != side2)
				triangle = "scalene";
			else
				if (side1 == side2 || side1 == side3 || side2 == side1 || side2 == side3 || side3 == side1 || side3 == side2)
					triangle = "isosceles";
		System.out.println("The sides of the triangle are "+side1+" , "+side2+" , "+side3+". The triangle is a(n) "+triangle+" triangle.");
	}

}