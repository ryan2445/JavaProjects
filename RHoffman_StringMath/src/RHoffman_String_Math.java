//Ryan Hoffman - Period 5
public class RHoffman_String_Math {

	public static void main(String[] args) {
		insert("AP",5);
		luckyNumber();
	}
	public static void insert(String str, int index){
		String s1 = "Computer Science";
		if(index<=s1.length()) {
		String beg = s1.substring(0,index);
		String end = s1.substring(index,s1.length());
		String combined = beg+str+end;
		System.out.println(combined);
		}
	}

	public static void luckyNumber() {
		int rolls=0;
		while((int)(Math.random()*6+1)+(int)(Math.random()*6+1)!=9) {
			rolls++;
		}
		
		System.out.print("It took "+rolls+" rolls to get to sum to 9.");
	}
}