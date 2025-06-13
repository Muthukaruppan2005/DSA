import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner (System.in);
    String str=n.nextLine().replaceAll("[aeiouAEIOU]","*");
    System.out.print(str);
  }
}
--------------
  /*
  Sample Input:
Hello World!

Sample Output:
H*ll* W*rld!
  */
