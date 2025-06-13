import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    linkedlist l = new linkedlist();
    int a=n.nextInt();
    for(int i=0;i<a;i++){
      int x=n.nextInt();
      l.insert(x);
    }
    if(a==0||a==1){
      System.out.print("List is empty");
      return;
    }
    l.deleteatend();
    l.display();
  }
}
class linkedlist{
  Node head=null,curr=null;
  void insert(int num){
    Node nn=new Node(num);
    if(head==null){
      head=nn;
      curr=nn;
    }else{
      curr.next=nn;
      curr=curr.next;
    }
  }
  
  void deleteatend(){
    Node temp=head,prev=head;
    while(temp.next!=null){
      prev=temp;
      temp=temp.next;
    }
    prev.next=null;
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
----------------------
  /*
  Sample Input:
5
10 20 30 40 50

Sample output:
10 20 30 40
  */
  
