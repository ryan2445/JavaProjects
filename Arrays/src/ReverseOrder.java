import java.util.Scanner;

public class ReverseOrder
{
   //-----------------------------------------------------------------
   //  Reads a list of numbers from the user, storing them in an
   //  array, then prints them in the opposite order.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);

      double[] numbers = new double[10];
      System.out.println ("The size of the array: " + numbers.length);

      for (int index = 0; index < numbers.length; index++)
      {
         System.out.print ("Enter number " + (index+1) + ": ");
         numbers[index] = scan.nextDouble();
      }
      
      System.out.println ("The numbers in reverse order:");
   //Write a for loop below that will print the numbers in opposite order
  //first run the code – do not attempt this without doing the readings 
//
      for(int i=19; i>=numbers.length; i--)
      {
    	  System.out.println(numbers[i]);
      }

      
   }
}