import java.util.*;
public class main{
  public static void main(String[]args){
  Scanner n=new Scanner(System.in);
  int a=n.nextInt();
  int b=a;
  int arr[][]=new int[a][b];
  for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
      arr[i][j]=n.nextInt();
    }
  }
  for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
      if(i==j){
        System.out.print(arr[i][j]+" ");
      }
    }
  }
        System.out.println();
  for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
      if((i+j)==a-1){
        System.out.print(arr[i][j]+" ");
      }
    }
  }
    
  }
}

-------------------------------------------
  import java.util.*;
public class Main{
  public static void main(String[]args){
  Scanner n=new Scanner(System.in);
  int a=n.nextInt();
  int b=a;
  int arr[][]=new int[a][b];
  for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
      arr[i][j]=n.nextInt();
    }
  }
  for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
      if(i==j){
        System.out.print(arr[i][j]+" ");
      }
    }
  }
        System.out.println();
    int i=0;
    while(i<a){
    for(int j=b-1;j>=0;j--){
        System.out.print(arr[i++][j]+" ");
    }
    }
  }
}

-------------------------------------------

/*print the diagonal elements of the matrix. A square matrix has two diagonals
Input Format:
The first line contains an integer n — the size of the square matrix.
The next n lines each contain n space-separated integers.

Output Format:
First line: all elements of the primary diagonal.
Second line: all elements of the secondary diagonal.


Constraints:
1 ≤ n ≤ 100
-10⁶ ≤ matrix[i][j] ≤ 10⁶


Example:
Sample Input:
3
1 2 3
4 5 6
7 8 9

Sample Output:
1 5 9
3 5 7  
*/
