//© A+ Computer Science  -  www.apluscompsci.com
//Name - Ryan Hoffman
//Date - 12/5/2017
//Class - P.5
//Lab  - OddsAndEvens
import java.util.*;
public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		//add test cases
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		OddsAndEvens.getAllOdds(array1);
		System.out.println("Odds: "+ Arrays.toString(OddsAndEvens.getAllOdds(array1)));
		System.out.println("Evens: "+ OddsAndEvens.getAllEvens(array1));
		
	}
}