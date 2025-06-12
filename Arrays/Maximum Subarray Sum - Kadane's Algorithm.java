import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n=new Scanner(System.in);
    int a=n.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
      arr[i]=n.nextInt();
    
    if(a==0){
      return;
    }
      
    int currsum=arr[0];
    int maxsum=arr[0];
    for(int i=1;i<arr.length;i++){
      currsum=Math.max(currsum+arr[i],arr[i]);
      maxsum=Math.max(maxsum,currsum);
    }
    
    System.out.print(maxsum);
  }
}
