public class Passenger 
{
	private String firstName;
	private String lastName;
	public Passenger()
	{
		firstName = "";
		lastName = "";
	}
	public Passenger(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}
	public String toString()
	{
		return firstName+" "+lastName;
	}
}