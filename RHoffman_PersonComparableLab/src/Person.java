//Ryan Hoffman - Period 5
public class Person implements Comparable<Object>{
	private String myName;
	private int myAge;
	private double myGPA;

	public Person(String name, int age, double gpa)
	{
		myName = name;
		myAge = age;
		myGPA = gpa;
	}

	public String getName()
	{
		return myName;
	}

	public int getAge()
	{
		return myAge;
	}
 
	public double getGPA()
	{
		return myGPA;
	}
 
	public void setName(String name)
	{
		myName = name;
	}
 
	public void setAge(int age)
	{
		myAge = age;
	}
 
	public void setGPA(double gpa)
	{
		myGPA = gpa;
	}
 
	public String toString()
	{
		return myName + ", age: " + myAge + ", gpa: " + myGPA;
	}

	public int compareTo(Object o) 
	{     
		int compare=0;
		if(o instanceof Person) {
			int age2 = ((Person) o).getAge();
			double gpa2 = ((Person) o).getGPA();
			if(myAge>age2) {
				compare=1;
			}
			if(myAge<age2) {
				compare=-1;
			}
			if(myAge==age2) {
				compare=0;
			}
			if(myAge==age2) {
				if(myGPA>gpa2) {
					compare=1;
				}
				if(myGPA<gpa2) {
					compare=-1;
				}
			}
			if(myAge==age2&&myGPA==gpa2) {
				compare=0;
			}
		}
		return compare;
		
		
		
		
	}	
		//if you need to call a Person method, you can use instanceof to 
            //check and then cast o to a Person type
		//insert code here
}
