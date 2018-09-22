import java.util.*;
public class TwoDArrays {

	public static void main(String[] args) {
		int [][]basic = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
		int [][]nonsquare = new int[][] { {1,2,3}, {4,5}, {6,7,8,9} };
		int [][]negatives = new int[][] { {1,-2,3}, {4,5,6}, {-7,8,-9} };
		int [][]rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
		int [][]colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };
		int [][]magic = new int[][] { {2,2,2}, {2,2,2}, {2,2,2}   };
		int [][]notmagic1 = new int[][] { {1,2,3}, {4,5,6}, {6,8,9} }; //diag sums   are not equal
		int [][]notmagic2 = new int[][] { {1,5,3}, {4,5,6}, {7,8,9} }; //diag sums //are equal but rows are not
		
		System.out.println(rowSum(basic,1));
		System.out.println(columnSum(basic,1));

	}
	public static int rowSum(int[][] a, int x){
		int sum =0;
		for(int i=0;i<a.length;i++){
			sum+=a[x][i];
		}
		return sum;
	}
	public static int columnSum(int[][] a, int x){
		int sum =0;
		for(int i=0;i<a.length;i++){
			sum+=a[i][x];
		}
		return sum;
	}
	public static int max(int[][] a){
		int max=0;
		int max2=0;
		for(int i=0;i<a.length;i++){
			int max2=a[]
		}
	}
}
