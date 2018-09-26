
public class StringReverser {

	public static String reverse(String a) {
		if(a.length()<=1) {
			return a;
		}
		
		return reverse(a.substring(1)) + a.charAt(0);
	}
}

/*
 * Ryan
 * yan R
 * an yR
 * n ayR
 */