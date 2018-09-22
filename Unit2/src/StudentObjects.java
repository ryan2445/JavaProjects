
public class StudentObjects {
	
	public static void main(String[]args)
	{
	    //array of objects
		
		//int [] myArray = new int[5];
		
		Student [ ] studentArray = new Student[10];
    
		 Student s1 =new Student();
		
		studentArray [0] = s1;
		
		studentArray[1] = new Student(110, 29.5, 1, "rando");
		//studentArray[1].getName();
		
		studentArray[2] = new Student();
		//	public Student(double test1, double t2, double t3,String nameIn)
		
		for(int i = 0; i< studentArray.length; i++)
			System.out.println(studentArray[i]);
	}

}
