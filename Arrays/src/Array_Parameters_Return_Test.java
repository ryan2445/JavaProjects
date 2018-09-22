import java.util.Arrays;
public class Array_Parameters_Return_Test {
	
	
public static void main (String [ ] args)
 {
 int [ ] number = new int [ 10]; // instantiate the array
 int i;
 int sum=0;
 int j = 1;
 for ( i = 0; i < 10; i++ ) // fill the array
 number[ i ] = j++;

 
 
 //import java.util.Arrays;
 System.out.println(Arrays.toString(number));

 //invoke the static method pass up the array number
 sum = Array_Parameters_Return.find_sum(number);

 System.out.println("The sum is " + sum + ".");

 //print content of Array, make sure to import java.util.Arrays
 System.out.println(Arrays.toString(number));

 //print the content of the returned Array
 System.out.println(Arrays.toString(Array_Parameters_Return.return_Array()));



 }
}