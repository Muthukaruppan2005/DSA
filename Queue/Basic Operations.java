import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n =  new Scanner(System.in);
    int a=n.nextInt();
    n.nextLine();
    Queue <Integer> q = new LinkedList<>();
    for(int i=0;i<a;i++){
      String str=n.nextLine();
      String arr[]=str.split(" ");
      switch(arr[0]){
        case "ENQUEUE":
          int val=Integer.parseInt(arr[1]);
          q.add(val);
          break;
          
        case "DEQUEUE":
          if(q.isEmpty()){
            System.out.println("Queue is empty");
            break;
          }
          System.out.println(q.poll());
          break;
          
        case "DISPLAY":
          if(q.isEmpty()){
            System.out.println("Queue is empty");
            break;
          }
          for(int ch:q)
            System.out.print(ch);
          break;
          
      }
    }
  }
}

-----------------------
  /*
  Implement a queue using an array with the following operations:

    enqueue(x): Add element x to the end of the queue.

    dequeue(): Remove and return the front element.

    display(): Show all elements in the queue from front to rear.

Input Format:

    First line: an integer n, the number of operations to perform.

    The next n lines contain operations:

        "ENQUEUE x" – insert element x

        "DEQUEUE" – remove front element

        "DISPLAY" – print the current queue elements

Output Format:

    For DEQUEUE, print the removed element or Queue is empty.

    For DISPLAY, print queue elements separated by space or Queue is empty


Constraints:
1 ≤ n ≤ 100

-10⁵ ≤ x ≤ 10⁵

Queue size is fixed to 100 for simplicity


Example:
Sample Input:

6
ENQUEUE 10
ENQUEUE 20
DEQUEUE
ENQUEUE 30
DISPLAY
DEQUEUE

Sample Output:

10
20 30
20

 


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
6
ENQUEUE 1
ENQUEUE 2
ENQUEUE 3
DEQUEUE
DEQUEUE
DISPLAY
1
2
3 
2	
2
DISPLAY
DEQUEUE
Queue is empty
Queue is empty
3	
3
DEQUEUE
ENQUEUE 15
DISPLAY
Queue is empty
15
  */
