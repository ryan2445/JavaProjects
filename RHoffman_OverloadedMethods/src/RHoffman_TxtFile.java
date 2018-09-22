
public class RHoffman_TxtFile {
	
     //Method1:
	public static void simpleInterest(double bal, double rate)
	{
	double interest;
	interest = bal * rate;
	System.out.println(" #1_Interest on " + bal + " at " +
	rate + " interest rate is " + interest);
	}

	//Method2:
	public static void simpleInterest(double bal, int rate)
	// Notice rate type
	{
	double interest, rateAsPercent;
	rateAsPercent = rate/100.0;
	// Converts whole number rate to decimal equivalent 
	interest = bal * rateAsPercent; 
	System.out.println(" #2_Interest on " + bal + " at " + rate + " interest rate is " + interest);
	}

	//Method3:
	public static void simpleInterest(int rate, double bal)
	// Notice rate type
	{ 
	double interest, rateAsPercent;
	rateAsPercent = rate/100.0;
	// Converts whole number rate to decimal equivalent 
	interest = bal * rateAsPercent; 
	System.out.println(" #3_ Interest on " + bal + " at " + rate + " interest rate is " + interest);
	}
	

/*	public static double simpleInterest(int rate, double bal)
	{ 
		double interest, rateAsPercent;
		rateAsPercent = rate/100.0;
		// Converts whole number rate to decimal equivalent 
		interest = bal * rateAsPercent; 
		System.out.println(" #4_ Interest on " + bal + " at " + rate + " interest rate is " + interest);
           return interest;
		
		}
*/

	
	public static void main(String[]args){
		//Q1: following code will work why or why not? which method will it print?
			simpleInterest(1000, 0.04);          //Method 3
	
		//Q2: following code will work why or why not? which method will it print?
			//simpleInterest (1000, 4);		//Will work with each method individually but won't find a method if they are all uncommented.

		 //Q3:following will work why or why not? which method will it print?
			//simpleInterest(1000.0, 4);		//Method 2

		//Q4:following code will work why or why not? which method will print- what will be printer?
			// simpleInterest(1000.0, 0.04);	//Method 1

		//Q5: following code will work why or why not? which method will print- what will be printed?
			//  simpleInterest(1000, 4); 		//Won't work
		
		//Q6:What if we added another  method  above with a method header: public static double simpleInterest( int rate, double bal)
		//Would the compiler see it as a different method and be happy :) or not Happy :( Why?
			//The compiler would be unhappy because there's already a method with parameters (int rate, double bal)  :(
		
		//Q7: Write the signature of Method 1 and Method 2
			//Method 1: simpleInterest(double bal, double rate)
			//Method 2: simpleInterest(double bal, int rate)
		
	}
	
}
