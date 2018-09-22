
//test, client, driver, main method 
public class BookShelf {
	
	
	public static void main(String[]args)
	{
		
		//creating , instantiating an object
		Book b1 = new Book("TKMB", "Lee", "randoPublisher", 1960 );
		
	     //print out b1's title 
		
	    System.out.println(b1.getTitle());
	    
		//make another Book object
	    
	    Book b2 = new Book("TKMB2", "Lee2", "randoPublisher", 1960 );
		
	     //print out b1's title 
		
	    System.out.println(b2.getTitle());
	    
	    
	    //change b2's author 
	    
	    b2.setAuthor("Ethan");
	    
	    System.out.println(b2);
	    
	    
	    
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
