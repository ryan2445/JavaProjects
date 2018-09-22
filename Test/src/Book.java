//template
public class Book
{

	//instance variables 
	//constructor(s)
	//accessor methods
	//mutator methods
	//utility methods
	
	
	//instance variables
	private String title, author, publisher;   //default values: null, 0, 0.0, false 
	private int copyright;
	
	
	//constructor   //titleIn = "TKMB"
	public Book(String titleIn, String authorIn, String publisherIn, int copyrightIn)
	{
		
		title = titleIn;   //TKMB 
		author = authorIn;
		publisher = publisherIn;
		copyright = copyrightIn;
		
		
	}
	
	//accessor
	
   public String getTitle()
   {
	   
	  return title;
	   
   }

	
   
   //mutator
   public void setAuthor(String authorIn)
   {
	   
	   author = authorIn;
	   
	   
   }
	
	
   //toString 
   public String toString()
   {
	   
	   
	   return "copyright: " + copyright  + "  author: " + author ; 
	   
	   
   }
   
	
	
	
	
	
	
	
	
	
	
}
