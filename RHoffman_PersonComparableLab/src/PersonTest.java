//Ryan Hoffman - Period 5
//I think there's a much more efficient way to do this but this works :D
public class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Ryan", 17, 3.7);
		Person p2 = new Person ("Marco", 15, 4.2);
		Person p3 = new Person ("Adam", 16, 4.2);
		
		System.out.println("Order: ");
		if(p1.compareTo(p2)>0&&p1.compareTo(p3)>0) {
			System.out.println(p1.toString());
		}
		if(p2.compareTo(p1)>0&&p2.compareTo(p3)>0){
			System.out.println(p2.toString());
		}
		if(p3.compareTo(p1)>0&&p3.compareTo(p2)>0) {
			System.out.println(p3.toString());
		}
		
		
		if(p1.compareTo(p2)>0&&p1.compareTo(p3)<0) {
			System.out.println(p1.toString());
		}
		if(p1.compareTo(p3)>0&&p1.compareTo(p2)<0) {
			System.out.println(p1.toString());
		}
		if(p2.compareTo(p1)>0&&p2.compareTo(p3)<0) {
			System.out.println(p2.toString());
		}
		if(p2.compareTo(p3)>0&&p2.compareTo(p1)<0) {
			System.out.println(p2.toString());
		}
		if(p3.compareTo(p1)>0&&p3.compareTo(p2)<0) {
			System.out.println(p3.toString());
		}
		if(p3.compareTo(p2)>0&&p3.compareTo(p1)<0) {
			System.out.println(p3.toString());
		}
		
		
		if(p1.compareTo(p2)<0&&p1.compareTo(p3)<0) {
			System.out.println(p1.toString());
		}
		if(p2.compareTo(p1)<0&&p2.compareTo(p3)<0){
			System.out.println(p2.toString());
		}
		if(p3.compareTo(p1)<0&&p3.compareTo(p2)<0) {
			System.out.println(p3.toString());
		}
		
		
		if(p1.compareTo(p2)==0) {
			System.out.println(p1.toString());
			System.out.println(p2.toString());
		}
		if(p1.compareTo(p3)==0) {
			System.out.println(p1.toString());
			System.out.println(p3.toString());
		}
		if(p2.compareTo(p3)==0) {
			System.out.println(p2.toString());
			System.out.println(p3.toString());
		}
}		
}
