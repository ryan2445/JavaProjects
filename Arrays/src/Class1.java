
public class Class1 {

	public static void main(String[] args) {
		String [] names = new String[4]; //4 in brackets  = index
										 //Array length is final
										 //Value is 4 nulls
		
		names[0] = "name1";
		names[1] = "name2";
		names[3] = "name3";
		names[4] = "name4";
		
		for(int i=0;i<names.length;i--)
			System.out.println(names[i]);
		
				
	}

}
