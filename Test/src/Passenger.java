
import java.util.Scanner;

public class Passenger
{
	
	private String firstName, lastName;

	
	//Overloaded constructor
	public Passenger()
	{
		firstName="Empty";
	}
	
	public Passenger(String first, String last)
	{
		firstName=first;
		lastName=last;
	}
	
	//Accessor methods
	public String getFirst()
	{
		return firstName;
	}
	
	public String getLast()
	{
		return lastName;
	}
	
	//toString
	public String toString()
	{
		return firstName + lastName;
	}

}
