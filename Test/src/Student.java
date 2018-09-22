
public class Student {
	//instance variables, fields, properties, attributes,
	//accessor modfier for instance variables should be private
	private int ID;  //default values int 0, double 0.0, string null
	private String name;
	private double test1;
	private double test2;
    private double test3;
    private Backpack bp;
	
 
	public Student()
	{  //this(100, 100, 1000, "studentName");
		test1 = 100;
		test2 = 100;
		test3 = 100;
	}
	
	public Student(String studentNameIN, Backpack bp)
	{   //this(100, 100, 1000, "studentName");
		test1 = 100;
		test2 = 100;
		test3 = 100;
		this.bp = bp;
		
	}
	public Student(double test1, double t2, double t3,String nameIn)
	{   
		this.test1 = test1;
		test2 = t2;
		test3 = t3;
		name = nameIn;
		
		
	}
	
	public void a(int a)
	{
		System.out.print("..");
	}
	
	   //t1 = 60, t2 = 70, t3= 80, nameIn = "stew"
	
	
    
	//accessor method, getter method
	//define methods: modifier returnType, name of method ( )
	
	public String getName()
	{
		
		return name;
		
	}
	
	

	public String toString()
	{
		return "name " + name + "test1 " + test1;
		
	}
	
	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	
	//write a method that returns the test average
	
	public double testAverage(int numbTest)
	{   return (test1 + test2 + test3)/numbTest;
	    //return average;
	    
		
	}
	
	public void zipBackpack()
	{ 
		
			System.out.println("Zipping Backpack");
	}
	
	
	public void addBackPackMaterials(Backpack b)
	{   if(b.getZippedOrNot()==false)
		 	zipBackpack();
	    else
	    	b.setTextbook1("randoBook1");
			b.setPencil1("pencil1");
		
	}
	
	public Backpack buyNewBackPack()
	{
		bp = new Backpack();
		return bp;
	}
	
	

	}
	
	

