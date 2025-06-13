import java.util.*;
public class Main
{
    static class Node
    {
        int data;
        Node next;
    }
    public static Node head = null;
    public static void append(int data)
    {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if(head==null)
            head = newnode;
        else
        {
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = newnode;
        }
    }
    public static void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void insertAtBeginning(int val)
    {
        Node nn = new Node();
        nn.data=val;
        nn.next=head;
        head=nn;
        // Write your logic
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val;
        for(int i=0;i<n;i++)
        {
            val = sc.nextInt();
            append(val);
        }
        int new_val = sc.nextInt();
        insertAtBeginning(new_val);
        display();
    }
}

----------------------------
/*
  Sample Input:
4
10 20 30 40
5

Sample Output:
5 10 20 30 40
*/
