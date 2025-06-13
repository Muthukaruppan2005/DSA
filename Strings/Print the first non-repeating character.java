import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    String str=n.nextLine();
    int c=0;
    for(int i=0;i<str.length();i++){
      int f=0;
      for(int j=0;j<str.length();j++){
        if(i!=j){
          if(str.charAt(i)==str.charAt(j)){
            f=1;
          }
        }
      }
      if(f==0){
        System.out.print(str.charAt(i));
        c=1;
        return;
      }
    }
    if(c==0){
        System.out.print("-1");
        return;
    }
  }
}
-----------------------
  /*
Input Format:
A single line containing a string

Output Format:
Print the first non-repeating character
If none exists, print -1


Constraints:
1 ≤ Length of string ≤ 1000
Case-sensitive
All characters are allowed (alphabets, digits, symbols, spaces)


Example:
Sample Input:
teeter

Sample Output:
r


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
swiss
w
2	
OpenAI
O
3	
1122334
4
4	
XYZxyz
X
5	
!!@@##$$% 
%
6	
mississippi
m
7	
C programming
C
8	
hello
h
9	
aabbcc
-1
10	
abcabcde
d
  */
