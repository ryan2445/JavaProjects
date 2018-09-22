import java.util.*;
public class Item 
{
	private int id;
	private double price;
	private String name;
	
	public Item(int id, double price, String name) 
	{
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public String toString() {
		return "\nName: "+name+" ID: "+id+" Price: "+price;
	}
	
}
