
public class Coffee {
	
	private int sugar, milk, size;
	private String name;
	private final int sugarCalories =15;
	private final int milkCalories = 25;
	
	
	public Coffee()  //default
	{  
		sugar = 1;
		milk = 2;
		size = 10;
		name = "coffee";
		
	}
	
	
	public Coffee(int sugarIn, int milkIn, int size, String name)
	{
		sugar = sugarIn;
		milk  = milkIn;
		
		
	}
	
	
	public int getSugar()  //
	{
		return sugar;
	}
	
	public  void setMilk(int milk)
	{
		this.milk = milk;
	}
	
	
	public int countCalorie()  
	{
		int sugarCaloriesX = sugar * sugarCalories;
	    int milkCaloriesY = milk * milkCalories;
	    return sugarCaloriesX + milkCaloriesY;
	}
	
	public String  toString() 
	{
		return "sugarcubes:" + sugar + "milk : " + milk + "name: " + name + "size: " + size;
		//return "21";
	}
	
	

}
