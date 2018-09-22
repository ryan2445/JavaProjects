//Ryan Hoffman - Period 5 - Comment Below
import java.util.*;
public class GrandmaSpyApp {

	public static void main(String[] args) {
		printConvertedText();
	}
	public static ArrayList<String> findFour(){
		ArrayList<String> usedWords = new ArrayList<String>();
		ArrayList<String> badWords = new ArrayList<String>(100);
		badWords.add("Adam");
		badWords.add("Book");
		badWords.add("Vape");
		badWords.add("Pepe");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence or phrase:");
		String input = scan.nextLine();
		ArrayList<String> four = new ArrayList<String>();
		for(int i=0;i<input.length();i++){
			if(i+5<input.length()) {
			if(!input.substring(i, i+4).contains(" ")&&(input.substring(i, i+5).contains(" "))){
				if(i-1>=0&&!input.substring(i-1, i).contains(" ")) {
					
				}
				else 
					four.add(input.substring(i, i+4));	
			}
		}
	}
		if(input.substring(input.length()-5,input.length()).contains(" ")){
			four.add(input.substring(input.length()-4,input.length()));
		}
		for(int i=0;i<badWords.size();i++) {
			for(int j=0;j<four.size();j++) {
				if(badWords.get(i).equalsIgnoreCase(four.get(j))) {
					usedWords.add(four.get(j));
				}
			}
		}
		System.out.println("Bad words used in this string: "+usedWords);
		usedWords.add(input);
		return usedWords;
		
	}
	public static String replaceFour(){
		ArrayList<String> a1 = findFour();
		String sentence = a1.get(a1.size()-1);
		for(int i=0;i<sentence.length();i++){
			if(i+5<sentence.length()) {
			if(!sentence.substring(i, i+4).contains(" ")&&(sentence.substring(i, i+5).contains(" "))){
				if(i-1>=0&&!sentence.substring(i-1, i).contains(" ")) {
					
				}
				else {
					for(int j=0;j<a1.size()-1;j++) {
						if(sentence.substring(i, i+4).equalsIgnoreCase(a1.get(j))) {
							//Couldn't figure out how to replace words in the string here without using string.replace
						}
					}
				}
					
			}
		}
	}
		return sentence;
		

}
	public static void printConvertedText() {
		System.out.print("Filtered String: "+replaceFour());
	}
}

//Adam wanted to vape with his book called pepe macqueen