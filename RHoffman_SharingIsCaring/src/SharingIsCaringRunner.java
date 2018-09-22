
public class SharingIsCaringRunner {

	public static void main(String[] args) {
		Lunch l1 = new Lunch("Sandwich", "Water");
		Lunch l2 = new Lunch("Hamburger", "Soda");
		
		Homework h1 = new Homework("No idea", "Still no idea", "What Is Life?");
		Homework h2 = new Homework("What Is Life?");
		
		Friend f1 = new Friend("Ryan", h1, l1);
		Friend f2 = new Friend ("Adam", h2, l2);
		
		
		System.out.println("--------------------------------");
		System.out.print("Checkpoint 1:\n");
		System.out.print(f1.toString());
		System.out.print(f2.toString());
		System.out.println("--------------------------------");
		
		SharingIsCaring.swapLunches(f1, f2);
		
		System.out.print("Checkpoint 2:\n");
		System.out.print(f1.toString());
		System.out.print(f2.toString());
		System.out.println("--------------------------------");
		
		
		if(Homework.todaysDate.equalsIgnoreCase(Homework.dueDate))
		{
		SharingIsCaring.shareHomework(h1, h2);
		}
		else
		{
			System.out.println("\nProcrastinate\n");
		}
		
		System.out.print("Checkpoint 3:\n");
		System.out.print(f1.toString());
		System.out.print(f2.toString());
		System.out.println("--------------------------------");
	}

}
