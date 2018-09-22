//Ryan Hoffman
//AP Java Period 5
public class Driver {

	public static void main(String[] args) {
		Person[] contactArray = new Person[3];
		Person c1 = new Person("Ryan", 1234567890, "notanemail@gmail.com");
		Person c2 = new Person("Adam", 1235673496, "possiblyanemail@gmail.com");
		Person c3 = new Person("Conner", 1235317846, "probablynotanemail@gmail.com");
		contactArray[0] = c1;
		contactArray[1] = c2;
		contactArray[2] = c3;
		
		
		Contact.addContact("New", 123, "Test");
		for(int i=0;i<contactArray.length;i++)
		{
			System.out.println(contactArray[i].toString()+"\n");
		}
		
	}

}
