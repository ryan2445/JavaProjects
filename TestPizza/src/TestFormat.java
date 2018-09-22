/**
 * Formatter class tester:
 * Contains a 6x6 array of Strings of various lengths.
 * Tests both the formatTabs() method and the formatSize() method, in the respective order.
 * Both tests are set to yield the same spacing for the sake of consistency.
 * The values used in the arguments for formatTabs() and formatSize() can be modified to fit the spacing needed.
 */
import java.math.*;
public class TestFormat {

	public static void main(String[] args) {
		
		Formatter form = new Formatter();
		
		String[][] testArray = new String[11][6];
		String[][] testArray2 = new String[11][6];
		Passenger[][] temp=new Passenger[10][5];
		temp=form.getP();
		//Array population(just populates the array with randomly sized numbers to demonstrate the spacing)
		
		//using formatTabs to create 3 tabs("\t values") of space in between each column
		System.out.println("----------formatTabs Test----------");
		for(int i = 0; i < testArray.length; i++) {
			for(int j = 0; j < testArray[i].length; j++)
				System.out.print(form.formatTabs(3, testArray[i][j]));
			System.out.println("\n");
		}
		
		//using formatTabs to create 24 characters of space in between each column
		System.out.println("----------formatSize Test----------");
		for(int i = 0; i < testArray.length; i++) {
			for(int j = 0; j < testArray[i].length; j++)
				System.out.print(form.formatSize(24, testArray[i][j]));
			System.out.println("\n");
		}	
	}
}
