
public class CoffeeTest {

	public static void main(String[] args) {
		Coffee c1= new Coffee("Ryan's Coffee", 10, 3, 2);
		//c1.setSize(5);
		System.out.println(c1.toString());
		System.out.println("Total Calories: "+c1.calCounter());
		//System.out.println("Size Again: "+c1.getSize());

	}

}
