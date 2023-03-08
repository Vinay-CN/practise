package OOPS.Inheritance;
class Parent{
 int income=100000;
 int expenditure=3000;
 String home="duplex";
 String car="bmw";
 public Parent(){
    System.out.println("parent constructor");
 }
 public Parent(int a)
 {
    System.out.println("first parent constructer will be printed then it will got to child");//first parent constructer printed when we create object for child class
    
 }
 public void drive()
 {
    System.out.println("i am driving bmw");
 }
 public void spend()
 {
    System.out.println("i am spending 3000");
 }
}
class Child extends Parent
{
   //it wil print parent default constructor first
    int money=income+500;
    String car="kia";
    public Child(int a){
        System.out.println("child construct");
    }
    public void spend()
    {
        System.out.println("i am spending my money + my parent money but my parent cant spend my money");
    }
    public void vrive()
    {
        System.out.println("i am driving kia and my parent car bmw but my parent can only drive bmw");
        drive();
    }
    {

    }
}
public class Topic {
    public static void main(String[] args) throws Exception {
       Child child = new Child(7);
        child.vrive();
        child.spend();
       // System.out.println("see now my parent cant access my things");
        // Parent parent = new Parent(4);
        // parent.drive(); 
        // parent.spend();
    }
}
