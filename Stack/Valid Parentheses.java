import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    int a=n.nextInt();
    n.nextLine();
    for(int i=0;i<a;i++){
      String str=n.nextLine();
      check(str);
    }
  }
  public static void check(String str){
    Stack <Character> st=new Stack<>();
    for(char ch:str.toCharArray()){
      if(ch=='('||ch=='{'||ch=='['){
        st.push(ch);
      }else{
        if((st.peek()=='('&&ch==')')||(st.peek()=='{'&&ch=='}')||(st.peek()=='['&&ch==']')){
          st.pop();
        }else{
          System.out.println("Not Balanced");
          return;
        }
      }
    }
    if(st.isEmpty()){
      System.out.println("Balanced");
    }else{
      System.out.println("Not Balanced");
    }
    
  }
}

----------------
  /*
Example:
Sample Input:

3
()[]
([{}])
([)]

Sample Output:

Balanced
Balanced
Not Balanced


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
1
((())
Not Balanced
2	
1
{[()]}
Balanced
3	
1
[{)]}
Not Balanced
  
  */
