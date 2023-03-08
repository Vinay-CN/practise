package OOPS;
class Chaining{
String name="default name";
int age=10;
String status="default status";
public Chaining(String name, int age, String status)
{
    // this.name=name;
    // this.age=age; instead of repeating this we can call second constructor
    this(name,age);
    this.status=status;
    System.out.println("constructer 1");
}
public Chaining(String name, int age){
    // this.name=name; instead of repeating this we can call first constructor
    this(name);
    this.age=age;
    System.out.println("constructer 2");
}
public Chaining(String name){
    this.name=name;      //we don't have to call any constructor 
    System.out.println("constructer 3");
}
}
public class ConstructerChaining {
    public static void main(String[] args) throws Exception {
    Chaining cl = new Chaining("vinu",10,"online");
    System.out.println(cl.name);
    System.out.println(cl.age); 
    System.out.println(cl.status);


    }

}
