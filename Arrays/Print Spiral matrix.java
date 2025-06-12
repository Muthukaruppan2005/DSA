/*
Description

Given an `m x n` matrix, return all elements of the matrix in spiral order (clockwise, starting from the top-left corner).

Input Format

- First line contains two integers `m` and `n` (1 ≤ m, n ≤ 100), representing the number of rows and columns.

- Next `m` lines each contain `n` space-separated integers representing the matrix elements.

Output Format

- Print all elements in spiral order, separated by spaces.


Constraints:
Matrix elements are integers with absolute value ≤ 10^9

- 1 ≤ m, n ≤ 100


Example:
Sample Input

3 3

1 2 3
4 5 6
7 8 9

Sample Output

1 2 3 6 9 8 7 4 5

*/
------------------------------------------------
import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    int a=n.nextInt();
    int b=n.nextInt();
    
    int arr[][]=new int[a][b];
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
        arr[i][j]=n.nextInt();
      }
    }
    
    int l=0,r=b-1,t=0,bot=a-1;
    while(l<=r && t<=bot){
      for(int i=l;i<=r;i++){
        System.out.print(arr[t][i]+" ");
      }
      t++;
      
      for(int i=t;i<=bot;i++){
        System.out.print(arr[i][r]+" ");
      }
      r--;
      
      if(t<=bot){
        for(int i=r;i>=l;i--){
          System.out.print(arr[bot][i]+" ");
        }
        bot--;
      }
      
      if(l<=r){
        for(int i=bot;i>=t;i--){
          System.out.print(arr[i][l]+" ");
        }
        l++;
      }
      
    }
 
    
  }
}
