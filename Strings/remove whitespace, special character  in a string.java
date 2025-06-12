import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n= new Scanner(System.in);
    String str=n.nextLine();
    str=str.replace("\\t","");
    str=str.replace("\\n","");                                           
    for(char ch:str.toCharArray()){
      if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
        System.out.print(ch);
      }
    }
    
  }
}


-------------------
  /*
  Input Format:
A single line string (can include spaces, tabs, newlines, and other characters)

Output Format:
A single line string with all whitespaces removed


Constraints:
1 ≤ Length of string ≤ 1000
The string can contain letters, digits, spaces, tabs, or special characters


Example:
Sample Input:
Open AI

Sample Output:
OpenAI


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
Tab\tHere
TabHere
2	
New\nLine
NewLine
3	
NoWhiteSpace
NoWhiteSpace
4	
Remove all spaces
Removeallspaces
5	
  Multiple   Spaces  
MultipleSpaces
6	
Tabs\tand\tspaces
Tabsandspaces
7	
Line\nBreaks\nHere
LineBreaksHere
8	
Hello World
HelloWorld
9	
A B C
ABC
10	
C\to\nd\te
Code
  */
