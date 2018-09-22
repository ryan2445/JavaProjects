public class Array_Parameters_Return {
public static int find_sum(int [ ] value) //method definition to find sum
 {
 int i, total = 0;
 for(i=0; i<10; i++)
 {
 total = total + value[ i ];
 }
 value [3] = 0;
 return total;
 }
public static int[] return_Array()
{
int [] array2 = {1, 2, 3, 4 };
return array2;
}
}