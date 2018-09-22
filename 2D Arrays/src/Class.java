
public class Class {

	public static void main(String[] args) {
		int [][] scores = {{100,200}, {200,300}, {5,25}};
		
		//change second 200 to 500
		scores[1][0] = 500;
		
		//print using a for loop
		int rows = 3;
		int cols = 1;
		//outer for loop = rows, inner for loop = columns
		
		for(int i=0;i<rows;i++){
		for(int  j=0; j<cols;j++){
			System.out.println(scores[i][j]+" ");
			System.out.println();
		}
			
		}
		

	}

}
