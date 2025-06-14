import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    int num=n.nextInt();
    System.out.print(fib(num-1));
  }
  public static int fib(int num){
    if(num==1 || num==0){
      return num;
    }else{
      return fib(num-1)+fib(num-2);
    }
    
  }
}

-------------------
  Sample Input:
6

Sample Output:
5
