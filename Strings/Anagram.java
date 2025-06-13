import java.util.*;
public class main{
  public static void main(String[]args)
  {
    Scanner n= new Scanner(System.in);
    String str=n.nextLine().toLowerCase().replaceAll("[^a-z]","");
    String str1=n.nextLine().toLowerCase().replaceAll("[^a-z]","");
    
    char a[]=str.toCharArray();
    char b[]=str1.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    if(Arrays.equals(a,b)){
      System.out.print("Anagram");
      
    }else{
      System.out.print("Not Anagram");
      
    }
  }
}



-------------------------------
/*
Two strings are called anagrams if they contain the same characters in any order, ignoring case and character positions. 
For example, "Listen" and "Silent" are anagrams.

Example:
Sample Input:
Listen
Silent

Sample Output:
Anagram


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
School master
The classroom
Anagram
2	
Astronomer
Moon starer
Anagram
3	
The Morse Code
Here come dots
Anagram
4	
Triangle
Integral
Anagram
5	
Listen!!!
Silent??
Anagram
6	
Apple
Plead
Not Anagram
7	
Debit Card
Bad Credit
Anagram
8	
Dormitory
Dirty Room
Anagram
9	
Hello
World
Not Anagram
10	
abc
cab
Anagram
*/
