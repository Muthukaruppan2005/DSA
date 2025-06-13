import java.util.*;
public class main{
  public static void main(String[]args){
    Scanner n=new Scanner(System.in);
    linkedlist l=new linkedlist();
    int a=n.nextInt();
    for(int i=0;i<a;i++){
      int num=n.nextInt();
      l.create(num);
    }
    int x=n.nextInt();
    if(a==0||a==1){
      l.create(x);
      l.display();
      return;
    }
    l.insertatmid(a/2,x);
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
  //no of elements divided by 2 for position
  //traverse till pos-1
  //add node
  void insertatmid(int ind,int val){
    Node newnode = new Node(val);
    if(head==null){
      head=newnode;
      curr=newnode;
    }else{
      Node temp=head;
      int c=0;
      while(c!=ind-1){
        c++;
        temp=temp.next;
      }
      newnode.next=temp.next;
      temp.next=newnode;
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
4
1 2 3 4
99
Sample output:
1 2 99 3 4
  */
