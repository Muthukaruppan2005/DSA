import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    String str=n.nextLine();
    StringBuilder rstr=new StringBuilder(str).reverse();
    System.out.print(rstr);
  }
}
