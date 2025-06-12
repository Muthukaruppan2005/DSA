import java.util.*;
public class main{
  public static int maximum(int a,int b,int c){
    return Math.max(a,Math.max(b,c));
  }
  public static int minimum(int a,int b,int c){
    return Math.min(a,Math.min(b,c));
  }
  
  
  public static void main(String[]args){
    Scanner n=new Scanner(System.in);
    int a=n.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
      arr[i]=n.nextInt();
    
    if(a==0){
      return;
    }
      
    int min=arr[0];
    int max=arr[0];
    int maxproduct=arr[0];
    for(int i=1;i<arr.length;i++){
      int temp=maximum(arr[i],arr[i]*min,arr[i]*max);
      min=minimum(arr[i],arr[i]*min,arr[i]*max);
      max=temp;
      maxproduct=Math.max(maxproduct,max);
    }
    
    System.out.print(maxproduct);
  }
}



------------------------
/*
Sample Input:
5
2 3 -2 4 -1

Sample Output:
48
*/
