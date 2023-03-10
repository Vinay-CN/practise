package LinkedList;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class Practise {
    static Node head;
    static Node tail;
    static void addLast(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }

    public static void Print(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }

        public static void removeFirst()
        {
            if(head==null)
            {
                System.out.println("EMPTY");
                return;
            }
            else{ if(head==tail)
                {
                    head=null;
                    tail=null;
                }
                else{
                    head=head.next;
                    System.out.println(head.data);
                }
                
            }
        }
    public static void printWN()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    static void addFirst(int value)
    {
        Node nn=new Node(value);
        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else
        {
            nn.next=head;
            head=nn;
        }
    }

    static int size()
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
  static Node getAt(int index)
  {
    Node temp=head;
    int length=size();
    if(index>length || index<0)
    {
        System.out.println("INVALID INDEX");
        return null;
    }
    else
    {//if i want index 3  it will take till 0 1 2 so 2.next will be 3 address , 
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
        //System.out.println(temp);
       // System.out.println(temp.data);
    }
    
    }
    static void addAt(int index,int value)
    {
        Node nn=new Node(value);
        if(index==size())
        {
            addLast(value);
        }
        else if(index==0)
        {
            addFirst(value);
        }
        else
        {
        //    Node temp=head;
        //    for(int i=0;i<index-1;i++) //-1 becuase it is 0 based 
        //    {
        //     temp=temp.next;
        //    }//15 14 13 11 12 //getAt will give 13 becuase it will run 2 times 2.next is 3 so  //new next=13.next; //13.next=new node;
         Node temp=getAt(index-1);                  
         nn.next=temp.next; 
           temp.next=nn;
       
        }
    }

    static void removeLast()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("EMPTY");
            return;
        }
        else{ 
            if(head==tail)
            {
                head=null;
                tail=null;
            }
            else{
            //    for(int i=0;i<size()-2;i++)
            //    {
            //     curr=curr.next;
            //    }
               curr=getAt(size()-2); //if size is 5 it will  run till 5-2 3 0 1 2 2.next 3.next=null; means 4th element is deleted then tail is shifted to 2.next 
               curr.next=null;
               tail=curr;
            }
        }
    }
    public static void main(String[] args){
        Node n1=new Node(5);
        Node n2=new Node(6);
        Node n3=new Node(7);
        Node n4=new Node(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        Print(n1);
        addLast(10);
        addLast(11);
        addLast(12);    
        Print(head);
        removeFirst();//doubt removeFirst(head);
        printWN();
        addFirst(13);
        addFirst(14);
        addFirst(15);
        printWN();
        System.out.println(size());
        //getAt(3);
        addAt(0,1);
        System.out.println(getAt(3).data);
       
        removeLast();
        printWN();
       
    }
}
//node temp=getAt(idx+1); it will give 3+1 4 = 0 1 2 3.next 4th address
//nn.next=temp