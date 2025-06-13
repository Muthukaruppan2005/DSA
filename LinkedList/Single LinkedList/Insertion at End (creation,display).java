import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n=new Scanner(System.in);
    linkedlist l=new linkedlist();
    int a=n.nextInt();
    if(a==0)
      return;
    for(int i=0;i<a;i++){
      int num=n.nextInt();
      l.create(num);
    }
    l.display();
  }
}

class linkedlist{
  
  Node head=null,curr=null;
  void create(int n){
    Node newnode=new Node(n);
    if(head==null){
      head=newnode;
      curr=newnode;
    }else{
      curr.next=newnode;
      curr=curr.next;
    }
      
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


-----------------------
/*
Sample Input:
5
10
20
30
40
50
Sample Output:
10 20 30 40 50
*/
