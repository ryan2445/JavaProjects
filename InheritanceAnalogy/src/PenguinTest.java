//Ryan Hoffman - Period 5
public class PenguinTest {

	public static void main(String[] args) {
		Penguin p1 = new EmperorPenguin(1,4,false,false,"Antarctica",true);
		Penguin p2 = new AfricanPenguin(2,2,true,true,"Africa",6);
		System.out.println(p1.toString());
		System.out.println();
		System.out.println(p2.toString());
		
		//You can use methods like feed() and sleep() to change values of "Full?" and "Asleep?".
		System.out.println();
		p1.speak();
		System.out.println();
		p2.swim();
	}

}
