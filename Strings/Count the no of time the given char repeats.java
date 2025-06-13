import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner (System.in);
    String str=n.nextLine();
    char str1=n.next().charAt(0);
    int c=0;
    for(char ch:str.toCharArray()){
      if(ch==str1){
        c++;
      }
    }
    System.out.print(c);
  }
}
-----------------------
  /*
  Example:
Sample Input:
Programming in C
g

Sample Output:
2


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
123@#12
1
2
2	
CaseSensitive
s
2
3	
Count Me In!
e
1
4	
Mississippi
s
4
5	
Data Science 101
1
2
6	
!@#$%^&*()!
!
2
7	
Case Sensitive
S
1
8	
OpenAI ChatGPT
A
1
9	
aaaaaaa
a
7
10	
Hello World
o
2
  */
