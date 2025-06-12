import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n= new Scanner(System.in);
    String str=n.nextLine();
    int v=0,c=0;
    for(char ch:str.toCharArray()){
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        v++;
      }else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
        c++;
      }
    }
    System.out.print( v+" "+c);
    
  }
}

--------------------
  /*
  Sample Input:
Hello World!

Sample Output:
3 7
  */
