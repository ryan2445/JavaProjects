import java.util.*;
public class Lunch {
	private String dish, drink;
	private static boolean isYummy=false;
	
	public Lunch(String dish, String drink) {
		this.dish = dish;
		this.drink = drink;
	}
	public String getDish(){
		return dish;
	}
	public String getDrink() {
		return drink;
	}
	public static boolean getIsYummy() {
		return isYummy;
	}
	public void setDish(String dishUpdate) {
		dish = dishUpdate;
	}
	public void setDrink(String drinkUpdate){
		drink = drinkUpdate;
	}
	public static void setIsYummy(boolean isYummyUpdate) {
		isYummy = isYummyUpdate;
	}
	public String toString(){
		return "Dish: "+dish+" Drink: "+drink+" The food is yummy: "+isYummy+"\n";
	}
}
