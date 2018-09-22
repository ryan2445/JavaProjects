//Ryan Hoffman - Period 5 - PerfectLab
import java.util.*;
public class PerfectLab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int end = scan.nextInt();
		int temp = 0;
		for (int i=1; i<=end; i++)
		{
			System.out.print(i+":");
			for(int j=1; j<=1; j++)
			{
				for (int k=1; k<=i; k++)
				{
					if (i%k==0)
					{
						if (k<i)
						{
						temp=temp+k;
						}
						System.out.print(" ");
						System.out.print(k);
						if (temp==i && temp!=1 && i==k)
							System.out.print(" "+k+" is a perfect number");
						if (i!=k)
							System.out.print(",");
					}
				}
			}
			System.out.println();
			temp=0;
			
				
		}
		
	}

}