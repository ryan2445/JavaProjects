
public class Circle {
	double radius = 5;
	double area = 20;
	double diameter = 10;
	
	Circle() {
		radius = 1;
	}

	public static void main(String[] args) {

	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double computeDiameter() {
		return radius * 2;
	}
	public double computeArea() {
		return radius * radius * 3.14;
	}
}
