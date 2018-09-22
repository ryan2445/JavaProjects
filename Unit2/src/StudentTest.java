//test class, driver, client 

public class StudentTest {
	
	public static void main(String[]args){
		//make an object
		//reference
		Student s1 = new Student();
		
		Student s3 = new Student(20.5, 110, 4, "name");
	    
		Backpack b1 = s1.buyNewBackPack(); //bp  //backpack object is returned from the method
		
		
		Student s2 = new Student("name",b1 );
		
		s1.addBackPackMaterials(b1); 
		
		
	}

}
