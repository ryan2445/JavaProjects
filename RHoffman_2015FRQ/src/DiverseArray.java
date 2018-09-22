import java.util.Arrays;

public class DiverseArray
{
  // Part (a)
  
  /**
   * Returns the sum of the entries in the one-dimensional array arr.
   */
  public static int arraySum(int[] arr)
  {
	  int sum = 0;
	    for (int x : arr)
	      sum += x;
	    return sum;
  }
  
  // Part (b)
  
  /**
   * Returns a one-dimensional array in which the entry at index k is the sum of
   * the entries of row k of the two-dimensional array arr2D.
   */
  public static int[] rowSums(int[][] arr2D)
  {
    int[] sums = new int[arr2D.length];
    for (int k = 0; k < sums.length; k++)
      sums[k] = arraySum(arr2D[k]);

    return sums;
  }
  
  // Part (c)
  
  /**
   * Returns true if all rows in arr2D have different row sums;
   * false otherwise.
   */
  public static boolean isDiverse(int[][] arr2D)
  {
    int[] sums = rowSums(arr2D);
    for (int k = 1; k < sums.length; k++)
      for (int j = 0; j < k; j++)
        if (sums[k] == sums[j])
          return false;

    return true;
  }

  /******************************************************************************/
   
  public static void main(String[] args)
  {
    int[][] mat1 = {{1, 3, 2, 7, 3},
                    {10, 10, 4, 6, 2},
                    {5, 3, 5, 9, 6},
                    {7, 6, 4, 2, 1}};
                    
    int[][] mat2 = {{1, 1, 5, 3, 4},
                    {12, 7, 6, 1, 9},
                    {8, 11, 10, 2, 5},
                    {3, 2, 3, 0, 6}};

    int[] sums = rowSums(mat1);
    System.out.println(Arrays.toString(sums));
    System.out.println(isDiverse(mat1) + " " + isDiverse(mat2));
  }  
}
