
public class Exponent {

	public static void main(String[] args) 
	{
		int number = 2;
		square(number);
		cube(number);
		System.out.println(number + " squared is equal to: " + square(number));
		System.out.print(number + " cubed is equal to: " + cube(number));

	}
	public static int square(int number)
	{
		int square = number * number;
		return square;
	}
	public static int cube(int number)
	{
		int cube = number * number * number;
		return cube;
	}

}
