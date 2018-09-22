
public class Coffee {
	private int sugar, milk, size;
	private String name;
	private final int sugarcals = 15;
	private final int milkcals = 25;
	
	public Coffee() {
	}
	public Coffee(String name, int size, int sugar, int milk) {
		this.name = name;
		this.size = size;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	public int calCounter() {
		int totalcals = 0;
		totalcals = (sugar*sugarcals) + (milk*milkcals);
		return totalcals;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		return "Name: "+name+"\nSize: "+size;
	}
}
