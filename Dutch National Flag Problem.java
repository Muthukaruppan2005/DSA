Sort an array of 0s, 1s and 2s - Dutch National Flag Problem

Description
Given an array of integers where each element is either 0, 1, or 2, sort the array in non-decreasing order. The algorithm should run in O(n) time complexity and use only constant extra space (O(1) space complexity).
Input Format
array. The first line contains an integer 'n' (1 ≤ n ≤ 10^6), the size of the
The second line contains 'n' space-separated integers (0, 1, or 2) representing the elements of the array.
Output Format
Print the sorted array with elements separated by spaces.






import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    int a= n.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
      arr[i]=n.nextInt();
    
    int low=0,mid=0,high=a-1,temp=0;
    while(mid<=high){
      switch(arr[mid]){
        case 0:
          temp=arr[low];
          arr[low++]=arr[mid];
          arr[mid++]=temp;
          break;
          
        case 1:
          mid++;
          break;
          
        case 2:
          temp=arr[mid];
          arr[mid]=arr[high];
          arr[high--]=temp;
          break;
          
      }
    }
    for(int i=0;i<a;i++)
      System.out.print(arr[i]+" ");
  }
}
