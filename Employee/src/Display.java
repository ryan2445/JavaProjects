
public class Display {

	public static void main(String[] args) {
		Data info1 = new Data();
		Data info2 = new Data();
		Data info3 = new Data();
		Data info4 = new Data();
		
		info1.getFirst();
		info1.getLast();
		info1.getID();
		info1.setFirst("Dave");
		info1.setLast("Smith");
		info1.setID(123);
		
		info2.getFirst();
		info2.getLast();
		info2.getID();
		info2.setFirst("Mike");
		info2.setLast("Johnson");
		info2.setID(456);
		
		info3.getFirst();
		info3.getLast();
		info3.getID();
		info3.setFirst("Shaun");
		info3.setLast("Williams");
		info3.setID(789);
		
		info4.getFirst();
		info4.getLast();
		info4.getID();
		info4.setFirst("Jake");
		info4.setLast("Jones");
		info4.setID(101);
		
		System.out.println("Employee 1 Information:");
		System.out.println("First Name: " + info1.getFirst());
		System.out.println("Last Name: " + info1.getLast());
		System.out.println("ID#: " + info1.getID());
		System.out.println("");
		System.out.println("Employee 2 Information:");
		System.out.println("First Name: " + info2.getFirst());
		System.out.println("Last Name: " + info2.getLast());
		System.out.println("ID#: " + info2.getID());
		System.out.println("");
		System.out.println("Employee 3 Information:");
		System.out.println("First Name: " + info3.getFirst());
		System.out.println("Last Name: " + info3.getLast());
		System.out.println("ID#: " + info3.getID());
		System.out.println("");
		System.out.println("Employee 4 Information:");
		System.out.println("First Name: " + info4.getFirst());
		System.out.println("Last Name: " + info4.getLast());
		System.out.println("ID#: " + info4.getID());
	}

}
