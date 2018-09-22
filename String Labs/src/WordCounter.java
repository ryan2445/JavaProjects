import java.util.*;
public class WordCounter {
	
		public static void WC(){
			int wordCount =1;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String input = scan.nextLine();
			for(int i=0;i<input.length();i++) {
				if(input.substring(i, i+1).equals(" ")) {
					wordCount++;
				}
			}
			System.out.println("Word Count: "+wordCount);	
		}
}
