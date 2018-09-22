import java.util.*;
public class AListMiniLab {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(9090);
		BankAccount b2 = new BankAccount(1234);
		
		ArrayList list = new ArrayList();
		list.add("Ryan");
		list.add(17);
		list.add(3.7);
		list.add(b1);
		list.add(b2);
		
		list.add(1, "A2");
		
		System.out.print("Size of list is: "+list.size()+"\n");
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		
		System.out.print("\n");

		for(int i=0;i<list.size();i++)
			if(list.get(i).equals("A2"))
			{
				System.out.print("Found A2!");
				list.remove(i);
			}
		
		list.set(2, 2018);
		
		System.out.print("\nLast Item: "+list.get(list.size()-1));
		
		System.out.print("\n"+b1.getAccountNumber());
		System.out.print("\n"+b2.getAccountNumber());
		
		System.out.print("\n"+list);
	}

}
