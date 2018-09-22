
public class TestCircle {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		circle1.setRadius(5);
		circle2.setRadius(10);
		circle1.computeDiameter();
		circle2.computeDiameter();
		circle3.computeDiameter();
		circle1.computeArea();
		circle2.computeArea();
		circle3.computeArea();
		System.out.println("Diameter of Circle 1: " + circle1.computeDiameter() + "\n" + 
		"Diameter of Circle 2: " + circle2.computeDiameter() + "\n" + 
		"Diameter of Circle 3: " + circle3.computeDiameter());
		System.out.println("Area of Circle 1: " + circle1.computeArea() + "\n" + 
		"Area of Circle 2: " + circle2.computeArea() + "\n" + 
		"Area of Circle 3: " + circle3.computeArea());
		
	}

}
