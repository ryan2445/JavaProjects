//Ryan Hoffman - Period 5
public class EmperorPenguin extends Penguin implements EmperorInterface{
	private boolean headcolor;
	private final static String FOOD_TYPE = "Krill";
	
	public EmperorPenguin() {
		super();
		headcolor=false;
	}
	public EmperorPenguin(int age, int height, boolean isFull, boolean isAsleep, String location, boolean headcolor) {
		super(age,height,isFull, isAsleep, location);
		this.headcolor=headcolor;
	}
	public void feed() {
	}
	public void feed(String foodType) {
		if(foodType.equalsIgnoreCase(FOOD_TYPE))
		super.feed();
	}
	public void sleep() {
		System.out.print("This Emperor Penguin wants to sleep for 5 hours");
		super.sleep();
	}
	public void wakeUp() {
		System.out.print("You have woken the Emperor Penguin up.");
		super.wakeUp();
	}
	public String toString() {
		return "Emperor Penguin Info:\n-Age: "+super.getAge()+" yr(s)\n-Height: "+super.getHeight()+" ft\n-Full?: "+super.getIsFull()+"\n-Asleep?: "+super.getIsAsleep()+"\n-Location: "+super.getLocation()+"\n-Head Color: "+headcolor;
	}
	
	public String getHeadColor() {
		return headColorHex;
	}
	public String changeHeadColor(String hex) {
		return hex;
	}
	public void speak() {
		System.out.print("*SQUAAAKK*");
	}
	public void swim() {
		System.out.print("This Emperor Penguin is swimming at 12mph");
	}
}
