import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class Shop {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		System.out.print("Availible Items:\n"
				+ "1. Name: Butter\n"
				+ "Price:$1.30\n"
				+ "ID:123\n"
				+ "\n2.Name: Corn\n"
				+ "Price:$3.45"
				+ "\nID: 456\n"
				+ "\n3. Name: Cookies"
				+ "\nPrice:$5.00"
				+ "\nID: 789\n"
				+ "\n4. Name: Pizza\n"
				+ "Price:$10.00"
				+ "\nID: 101\n"
				+ "\n5. Name: Doughnuts\n"
				+ "Price:$1.00"
				+ "\nID: 112");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\nWould you like to add an item to your shopping cart? Y/N");
		String yn=scan.next();
		if(yn.equals("N")) {
			System.exit(0);
		}
		while (yn.equals("Y"))
		{
		System.out.println("\n\nWhich item would you like to add to your shopping cart?");
		int input = scan.nextInt();
		System.out.println("How many?");
		int input2 = scan.nextInt();
		if(input==1) {
			for(int i=0;i<=input2;i++){
			cart.addItem(123, 1, 1.30, "Butter");
			System.out.println("Butter has been added to your cart\n");
			}
		}
		if(input==2) {
			for(int i=0;i<input2;i++){
			cart.addItem(456, 1, 3.45, "Corn");
			System.out.println("Corn has been added to your cart\n");
			}
		}
		if(input==3) {
			for(int i=0;i<input2;i++){
		
			cart.addItem(789, 1, 5.00, "Cookies");
			System.out.println("Cookies have been added to your cart\n");
			}
		}
		if(input==4) {
			for(int i=0;i<input2;i++){
		
			cart.addItem(101, 1, 10.00, "Pizza");
			System.out.println("Pizza has been added to your cart\n");
			}
		}
		if(input==5) {
			for(int i=0;i<input2;i++){
			cart.addItem(112, 1, 1.00, "Doughnuts");
			System.out.println("Doughnuts have been added to your cart\n");
			}
		}
		System.out.println("Would you like to add another item to your shopping cart? Y/N");
		yn=scan.next();
		}
		
		//Searches for item ID and removes it.
		cart.removeItem(456);
		System.out.println(cart.toString());
		System.out.println("Total Cost: $"+cart.getTotalCost());

	}

}
