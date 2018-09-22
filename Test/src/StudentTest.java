//test class, driver, client 

public class StudentTest {
	
	public static void main(String[]args){
		
		Student s1 = new Student();
		
		Backpack b1 = s1.buyNewBackPack();  //backpack object is returned from the method
		
		s1.addBackPackMaterials(b1); 
		
		
	}

}
