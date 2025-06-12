/*
Description

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements. Given an m x n matrix, determine if it is Toeplitz.

Input Format

First line contains two integers m and n (1 ≤ m, n ≤ 1000), representing the number of rows and columns.
Next m lines each contain n space-separated integers representing the matrix elements.
Output Format

Print "true" if the matrix is Toeplitz, otherwise print "false".

Constraints:
Matrix elements are integers with absolute value ≤ 10^9
1 ≤ m, n ≤ 1000

Example:
Sample Input
3 4

1 2 3 4
5 1 2 3
9 5 1 2

Sample output
true


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
3 3
1 2 3
4 1 2
5 4 1
true
2	
1 5
1 2 3 4 5
true
3	
4 1
1
2
3
4
true
4	
3 4
1 2 3 4
5 1 2 3
9 5 1 2
true
5	
3 3
7 7 7
7 7 7
7 7 7
true
6	
4 5
1 2 3 4 5
6 1 2 3 4
7 6 1 2 3
8 7 6 1 2
true
7	
1 4
1 2 3 4
true
8	
2 2
1 2
2 1
true
9	
3 3
1 2 3
4 1 2
5 4 1
true
  */
------------------------------------------
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
    int f=0;
    for(int i=0;i<a-1;i++){
      for(int j=0;j<b-1;j++){
        if(arr[i][j]!=arr[i+1][j+1]){
          f=1;
        }
      }
    }
    
    if(f==1){
      System.out.print("false");
    }else{
      System.out.print("true");
    }
    
    
  }
}
