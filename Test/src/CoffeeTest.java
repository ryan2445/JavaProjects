
public class CoffeeTest {
	
	public static void main(String[]args)
	{
		Coffee c1 = new Coffee(2,2,1, "Starbucks");
		Coffee c0 = new Coffee();
		
		
		//Coffee c2 = new Coffee();
		Coffee c2 = new Coffee(3,1,2, "Petes");
		
		//c1.countCalorie(2,2); //should not passup parameters here 
		System.out.println(c1.getSugar());
		
		//System.out.println(sugar);
		
		c1.setMilk(4);
		System.out.println(c1); //no need to invoke toString
		
		 c1.getSugar();
		 
		 
		
		
	}

}
