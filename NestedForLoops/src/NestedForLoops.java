//Ryan Hoffman - Period 5 - NestedForLoops
public class NestedForLoops {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++)
		{
			for (int j =1; j<=5-i; j++)
				System.out.print("_");
			for (int k =1; k<=i; k++)
				System.out.print(k);
			System.out.println();
		}
		System.out.print("\n");
		
		for (int i=5; i>=1; i--)
		{
			for(int j =1; j<=i; j++)
				System.out.print(i*2-1);
			System.out.println();
		}
		System.out.print("\n");
		
		for (int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j*2-1);
			System.out.println();
		}
		System.out.print("\n");
		for (int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print((j*2-1)+" ");
			System.out.println();
		}

	}
}
/* Problem 1:
 * Output:
 * R
 * RR
 * RRR
 * RRRR
 * RRRRR
 * 
 * Bye
 * 
 * Problem 2:
 * Output: 0 1 0 0
 * 
 * Problem 3:
 * Output: total = 14
 */
