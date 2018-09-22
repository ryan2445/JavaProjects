
public class Numbers 
 {

	public static void main(String[] args) 
	 {
		int number1 = 10;
		int number2 = 5;
		sum(number1, number2);
		difference(number1, number2);
		product(number1, number2);
		System.out.print("The product of " + number1 + " and " + number2 + " is equal to: " + product(number1,number2));

	 }
	public static void sum(int number1, int number2) 
	 {
		System.out.println("The sum of " + number1 + " and " + number2 + " is equal to: " + (number1 + number2));
	 }
	public static void difference(int number1, int number2)
	{
		System.out.println("The difference of " + number1 + " and " + number2 + " is equal to: " + (number1 - number2));
	}
	public static int product(int number1, int number2)
	{
		int product = number1 * number2;
		return product;
	}

 }

