import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    Stack <Character> st=new Stack<>();
    String str=n.nextLine();
    for(char ch:str.toCharArray()){
      st.push(ch);
    }
    while(!st.isEmpty()){
      System.out.print(st.pop());
    }
  }
}

-------------------------
  /*
  Sample Input:

Mission123

Sample Output:

321noissiM
  */
