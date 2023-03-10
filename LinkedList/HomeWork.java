package LinkedList;
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        next=null;
    }

}

public class HomeWork {


    public static void Print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(" ");

    }

    static Node head;
    static Node tail;


    public static void add(int value)
    {
        Node n1=new Node(value);
        if(head==null)
        {
            head=n1;
            tail=n1;
        }
        else{
            tail.next=n1;
            tail=n1;
        }

    }


    public static void remove()

    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else if(head.next==null)
        {
            head=null;
            tail=null;
        }
        else{
            Node nextHead=head.next;
            head=nextHead;
        }
    }


    public static int Size(){
        int size=0;
        Node temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }

    public static Node getAt(int index)
    {
        int length=Size();
        if(index < 0 || index > length)
        {
            System.out.println("Index out of range");
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public static void main(String[] args)
    {
       Node n1=new Node(1);
       Node n2=new Node(2);
       n1.next=n2;
        Node n3=new Node(3);
        n2.next=n3;
        add(4);
        add(5);
        add(6);
        add(7);
        add(8);
        add(9);
        Print();
        remove();
        System.out.println("");
        Print();
        System.out.println(Size());
        Node idx=getAt(3);
        System.out.println(idx.data);

    }
}
