/*Description

Given an array of integers, rotate the array to the left by `D` positions. The rotation should be done in-place with O(1) space complexity (excluding the input array itself).

Input Format

 First line contains two integers `n` (1 ≤ n ≤ 10^5) and `D` (0 ≤ D ≤ 10^5), where `n` is the size of the array and `D` is the number of positions to rotate left.

 Second line contains `n` space-separated integers representing the array elements.

Output Format

 Print the rotated array with elements separated by spaces.


Constraints:
1 ≤ n ≤ 10^5

0 ≤ D ≤ 10^5

Array elements are integers with absolute value ≤ 10^9


Example:
Sample Input

5 2

1 2 3 4 5

Sample Output

3 4 5 1 2


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
7 0
3 1 4 1 5 9 2
3 1 4 1 5 9 2
2	
5 7
1 2 3 4 5
3 4 5 1 2
3	
1 5
42
42
4	
3 0
1 2 3
1 2 3
5	
5 2
1 2 3 4 5
3 4 5 1 2
6	
6 1
11 12 13 14 15 16
12 13 14 15 16 11
7	
5 3
0 0 0 0 0
0 0 0 0 0
8	
6 3
10 20 30 40 50 60
40 50 60 10 20 30
9	
4 4
1 2 3 4
1 2 3 4

*/
-------------------------------







import java.util.*;
public class main{
  
  public static void reverse(int arr[],int s,int e){
    while(s<e){
      int temp=arr[s];
      arr[s++]=arr[e];
      //s++;
      arr[e--]=temp;
      //e--;
    }
  }
  
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    int a= n.nextInt();
    int d= n.nextInt();
    
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
      arr[i]=n.nextInt();
    
    d=d%a;
    reverse(arr,0,d-1);
    reverse(arr,d,a-1);
    reverse(arr,0,a-1);
    
    
    for(int i=0;i<a;i++)
      System.out.print(arr[i]+" ");
  }
}
