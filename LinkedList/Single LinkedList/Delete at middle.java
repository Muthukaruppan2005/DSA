/*
  This task is to delete the node in the middle of the linked list.

If the number of nodes is odd, delete the middle node (e.g., for 5 nodes, delete the 3rd).
If the number of nodes is even, delete the first middle (e.g., for 4 nodes, delete the 2nd)

Input Format:

The first line contains an integer n — the number of nodes in the list.
The second line contains n space-separated integers — the elements of the list.
Output Format:

Output the list after deleting the middle node.
If the list becomes empty, print "List is empty".

Constraints:
NA


Example:
Sample Input:
5
10 20 30 40 50
Sample Output:
10 20 40 50

*/
-------------------------
import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    linkedlist l=new linkedlist();
    int a=n.nextInt();
    for(int i=0;i<a;i++){
      int x=n.nextInt();
      l.insert(x);
    }
    if(a==1){
      System.out.print("List is empty");
      return;
    }
    l.deleteatmid(a);
    l.display();
  }
}

class linkedlist{
  Node head=null,curr=null;
  void insert(int num){
    Node nn = new Node(num);
    if(head==null){
      head=nn;
      curr=nn;
    }else{
      curr.next=nn;
      curr=curr.next;
    }
  }
  
  void deleteatmid(int a){
    int mid=0;
    if(a==2){
      Node t=head;
      head=head.next;
      t.next=null;
      return;
    }else if(a%2==0){
      mid=(a/2)-2;
    }else{
      mid=(a/2)-1;
    }
    Node temp=head;
    Node del=temp;
    int c=0;
    while(c!=mid){
      c++;
      temp=temp.next;
    }
    del=temp.next;
    temp.next=del.next;
    del.next=null;
  }
  
  void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
  
}




class Node{
  int data;
  Node next;
  Node(int val){
    this.data=val;
    this.next=null;
  }
}
