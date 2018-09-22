//Ryan Hoffman - Period 5
public class AfricanPenguin extends Penguin{
	private int stripes;
	private final static String FOOD_TYPE = "Sardines";
	
	
	public AfricanPenguin() {
		super();
		stripes=0;
	}
	public AfricanPenguin(int age, int height, boolean isFull, boolean isAsleep, String location, int stripes) {
		super(age,height,isFull, isAsleep, location);
		this.stripes=stripes;
	}
	public void feed() {
	}
	public void feed(String foodType) {
		if(foodType.equalsIgnoreCase(FOOD_TYPE))
		super.feed();
	}
	public void sleep() {
		System.out.print("This African Penguin wants to sleep for 8 hours");
		super.sleep();
	}
	public void wakeUp() {
		System.out.print("You have woken the African Penguin up.");
		super.wakeUp();
	}
	public String toString() {
		return "Emperor Penguin Info:\n-Age: "+super.getAge()+" yr(s)\n-Height: "+super.getHeight()+" ft\n-Full?: "+super.getIsFull()+"\n-Asleep?: "+super.getIsAsleep()+"\n-Location: "+super.getLocation()+"\n-Stripes: "+stripes;
	}
	public void speak() {
		System.out.print("*CHIRP*");
	}
	public void swim() {
		System.out.print("This African Penguin is swimming at 20mph");
	}
}
