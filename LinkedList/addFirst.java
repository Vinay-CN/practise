package LinkedList;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class addFirst {
    static Node head;
    static Node tail;
    public static void Print()
    {
        //Node curr=head;
        while(head!=null)
        {
            System.out.println(head.data);
            Node curr=head.next;
            head=curr;
        }
        //System.out.println(tail.data);
    }
    public static void add(int data)
    {
        Node n1= new Node(data);
        if(head==null)
        {
            head=n1;
            tail=n1;
        }
        
        else
        {
            n1.next=head;
            head=n1; 
        }
    }
    public static void removelast()
    {
        
    }
    public static void main(String[] args){
        add(20);
        add(30);
        add(40);
        Print();
        removelast();
    }
}
