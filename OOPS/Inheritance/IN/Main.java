package OOPS.Inheritance.IN;

class Parent{
    String name="default";
    int age=10;
    // void display(){
    //     System.out.println("parent values"+name+" "+age);
    // }
    public Parent()
    {
        //System.out.println("i am parent");
    }
    public Parent(String name, int age)
    {
        this.name=name;
        this.age=age;

    }
    public void check()
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent
{
    int salary=1000;
    public Child(){
        //System.out.println("i am child");
    }
    public Child(String name,int age, int salary)
    {
        super(name,age);
        this.salary=salary;
        System.out.println("child values"+name+" "+age+" "+salary);
    }
    public void check()
    {
        System.out.println("child class");
    }

}
class grandChild extends Child{
    public grandChild(int salary){
        super.salary=salary;//setting value at child class
    }
    }
    
public class Main {
    public static void main(String[] args)
    {
       //Child child = new Child();
       //child.display();
       grandChild a=new grandChild(10000);
        
    }
}
