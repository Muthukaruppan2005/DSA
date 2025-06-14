import java.util.Scanner;
public class Main
{
    public static void bubbleSort(int arr[], int n)
    {
        int temp=0;
        for(int i=0;i<n;i++){
          int c=0;//flag for checking any element is swapped or not
          for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
              temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
              c=1;//if any elements  swapped then c=1 
            }
          }
          if(c==0){//if elements are not swapped then it is already sorted
            break;
          }
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		bubbleSort(arr,n);
		for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
	}
}
----------------
  /*
  Sample Input:
6
65 23 89 12 78 34

Sample Output:
12 23 34 65 78 89
  */
