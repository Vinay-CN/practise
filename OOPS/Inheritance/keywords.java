package OOPS.Inheritance;
class Parent{
    String name="default";
    int age=10;
    public Parent(){
        System.out.println("default parent");
    }
    public Parent(String name,int age){
    this.name=name;
    this.age=age;
    }
}
class Child extends Parent{
        int job=2;
        public Child(){
            System.out.println("default child");
        }
    public void abcd(String name, int age, int job){
        super.name=name;
        super.age=age;
        this.job=job;
        System.out.println("Child class");
    }
}

public class keywords {
    public static void main(String[] args)
    {
     Child child=new Child();
    child.abcd("vinay",23,1);
    }
}
