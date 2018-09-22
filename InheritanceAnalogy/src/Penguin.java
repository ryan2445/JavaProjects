//Ryan Hoffman - Period 5
public abstract class Penguin {
	private int age;
	private int height;
	private boolean isFull;
	private boolean isAsleep;
	private String location;
	
	public Penguin () {
		age=0;
		height=0;
		isFull=false;
		isAsleep=false;
		location="";
	}
	public Penguin(int age, int height, boolean isFull, boolean isAsleep, String location) {
		this.age=age;
		this.height=height;
		this.isFull=isFull;
		this.isAsleep=isAsleep;
		this.location=location;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public boolean getIsFull() {
		return isFull;
	}
	public boolean getIsAsleep() {
		return isAsleep;
	}
	public String getLocation() {
		return location;
	}
	public void feed() {
		isFull=true;
	}
	public void sleep() {
		isAsleep=true;
	}
	public void wakeUp() {
		isAsleep=false;
	}
	public abstract void speak();
	public abstract void swim();
}
