
public class RecursiveMultiplication {

	public static int multiply(int x, int y) {
		if(x==0 || y==0) {
			return 0;
		}
		else {
			return x + multiply(x,y-1);
		}
	}
}
