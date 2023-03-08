package OOPS.Poly;
class Parent{
    int age=10;
    int salary=100;
    //overloading
    public void doing()
    {
        System.out.println(age);
        System.out.println(salary);
    }
    //overriding
    public int count(int age, int salary)
    {
        return age+salary;
    }
}
class Child extends Parent{
    public void doing(int age, int salary)//we are changing the parameters here overloading;
    {
        super.age=age;
        super.salary=salary;
        System.out.println("overload");
    }
    @Override
    public int count(int age, int salary)
    {
        return age+salary+1;
    }
}
public class Main {
    public static void main(String[] args)
    {
Child child = new Child();
        System.out.println(child.count(10,10));//uses new logic overriden from parent class
        Parent parent = new Parent();
        System.out.println(parent.count(10,10));//uses old logic written in parent class
    }
}
