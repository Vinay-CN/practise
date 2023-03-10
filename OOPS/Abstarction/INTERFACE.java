package OOPS.Abstarction;
interface Parent{
    int a=50;//by default its final;
void display();
void say();
}
interface GrandChild {
    void display();
}
//multiple inheritance
class Child implements Parent,GrandChild{//this must implemet all functions of parent otherwise error
    public void display() {
        System.out.println("Child class");
    }
    public void say() {
        System.out.println("Child class2");
    }
}
public class INTERFACE {
    public static void main(String[] args) {
       Parent p=new Child();
        p.display();
        p.say();
    }
}
