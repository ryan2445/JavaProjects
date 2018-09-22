import java.util.*;
public class ShoppingCart {
	private ArrayList<Item> itemList;
	private double totalCost;
	
	public ShoppingCart() {
		itemList = new ArrayList<Item>();
		totalCost=0;
	}
	
	public void addItem(int id, int qty, double price, String name) {
		Item temp = new Item(id, price, name);
		totalCost+=(price*qty);
		totalCost+=(totalCost*.05);
		itemList.add(temp);
	}
	public int searchForItem(int id){
		int index=0;
		for(int i=0;i<itemList.size();i++) {
			if(itemList.contains(id)) {
				index=i;
			}
		}
			//Couldn't figure out how to to get itemList.contains(id) to work with method.
		return index;
	}
	public void removeItem(int id){
		int delete=searchForItem(id);
		itemList.remove(delete);
		//totalCost-=
		
	}
	public double getTotalCost() {
		return totalCost;
	}
	public Item getItem(int i){
		return itemList.get(i);
	}
	public String toString() {
		return itemList.toString();
	}
	
}
