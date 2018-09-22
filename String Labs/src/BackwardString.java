import java.util.*;
public class BackwardString {
	
	public static void BS(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.next();
		System.out.print("Backwards: ");
		for(int i=input.length()-1;i>=0;i--){
			System.out.print(input.substring(i, i+1));
		}
		System.out.println("");
	}
}
//indexOf, subset, length() only