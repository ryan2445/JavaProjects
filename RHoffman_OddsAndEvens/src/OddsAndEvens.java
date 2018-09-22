//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		int numOdd = 0;
		for (int i=0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				
			}
		}
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int numEven = 0;
		for (int i=0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				numEven++;
			}
		}
		int[] evens = new int[array.length-countEm(array, false)];
		int count = 0;
		for (int i=0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				evens[count] = array[i];
			}
		}
		return evens;
	}

	public static int[] getAllOdds(int[] array)
	{
		int numberEvens = 0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				numberEvens++;
			}
		}
		return array;		
	}
}