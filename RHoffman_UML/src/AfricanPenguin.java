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
	public void feed(String foodType) {
		if(foodType.equalsIgnoreCase(FOOD_TYPE))
		super.feed();
	}
	public String toString() {
		return "African Penguin Info:\n-Age: "+super.getAge()+" Year(s)\n-Height: "+super.getHeight()+" Feet\n-Full?: "+super.getIsFull()+"\n-Asleep?: "+super.getIsAsleep()+"\n-Location: "+super.getLocation()+"\n-Stripes: "+stripes;
	}

}