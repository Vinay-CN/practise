package LinkedList;
class Node{
    int data;   
    Node next;
    public Node(int data){
        this.data = data;
    }
    public Node(){}
    

}

public class First {
    public static void Printer(Node n1){
    
        Node curr=n1;
        while(curr!=null){
            System.out.println(curr.data);
            Node nextNode=curr.next;
            curr=nextNode;
        }   
}
static Node head;
static Node tail;
public static void addLast(int value)
{
    Node nn=new Node(value);
    if(head==null){
        head=nn;//when we get first value then it will run both head and tail will point towards this
        tail=nn;
    }
    else
    {
        tail.next=nn;
        tail=nn;
    }
    System.out.println(nn.data);
}
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.data=2;
        Node n2 = new Node();
        n2.data=3;
        n1.next=n2;
        Node n3 = new Node();
        n3.data=4;
        n2.next=n3;
        Node n4 = new Node();
        n4.data=5;
        Printer(n1);
        addLast(6);
        
        

       
    }
}
