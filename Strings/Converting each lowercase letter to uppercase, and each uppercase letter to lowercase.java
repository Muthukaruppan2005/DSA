import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner (System.in);
    String str=n.nextLine();
    for(char ch:str.toCharArray()){
      if(Character.isLowerCase(ch)){
        System.out.print(Character.toUpperCase(ch));
      }else if(Character.isUpperCase(ch)){
        System.out.print(Character.toLowerCase(ch));
      }else{
        System.out.print(ch);
      }
    }
  }
}
------------------------------------------
/*
Input Format:
A single line containing a string

Output Format:
A single line containing the toggled string


Constraints:
1 ≤ Length of the string ≤ 1000
String can include letters, digits, spaces, and symbols
Only letters are toggled; others remain unchanged


Example:
Sample Input:
HeLLo123!

Sample Output:
hEllO123!


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
C Language!
c lANGUAGE!
2	
123abcDEF
123ABCdef
3	
ALLlowerCASE
allLOWERcase
4	
Data Science
dATA sCIENCE
5	
Test@2025
tEST@2025
6	
MixedCASE123!
mIXEDcase123!
7	
hello WORLD
HELLO world
8	
OpenAI
oPENai
9	
tOGGLE
Toggle
10	
Python3.8
pYTHON3.8
*/
