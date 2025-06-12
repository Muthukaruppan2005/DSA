/*
Description

Given an `n x n` matrix, rotate it by 90 degrees clockwise in-place (without using extra space).

 Input Format

 First line contains integer `n` (1 ≤ n ≤ 100), the size of the square matrix.

 Next `n` lines each contain `n` space-separated integers representing the matrix elements.

 Output Format

 Print the rotated matrix with elements separated by spaces and rows separated by newlines.


Constraints:
Matrix elements are integers with absolute value ≤ 10^9

1 ≤ n ≤ 100


Example:
Sample Input

3
1 2 3
4 5 6
7 8 9

Sample Output

7 4 1
8 5 2
9 6 3
*/
-------------------------------------
import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    int a=n.nextInt();
    
    int arr[][]=new int[a][a];
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        arr[i][j]=n.nextInt();
      }
    }
    for(int i=0;i<a;i++){
      for(int j=a-1;j>=0;j--){
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
    
    
    
  }
}
