//Ryan Hoffman - Period 5
public class EmperorPenguin extends Penguin{
	private String headcolor;
	private final static String FOOD_TYPE = "Krill";
	
	public EmperorPenguin() {
		super();
		headcolor="";
	}
	public EmperorPenguin(int age, int height, boolean isFull, boolean isAsleep, String location, String headcolor) {
		super(age,height,isFull, isAsleep, location);
		this.headcolor=headcolor;
	}
	public void feed(String foodType) {
		if(foodType.equalsIgnoreCase(FOOD_TYPE))
		super.feed();
	}
	public String toString() {
		return "Emperor Penguin Info:\n-Age: "+super.getAge()+" Year(s)\n-Height: "+super.getHeight()+" Feet\n-Full?: "+super.getIsFull()+"\n-Asleep?: "+super.getIsAsleep()+"\n-Location: "+super.getLocation()+"\n-Head Color: "+headcolor;
	}
}
