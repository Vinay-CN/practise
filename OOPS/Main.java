package OOPS;
class Student
{
    String name="default name";
    int rollno=0;
    public void display()
    {
        System.out.println("from "+name);
    }
    
}
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Student s1=new Student();
        Student s2=new Student();
       s1.name="vinu";
       s2.name="Manu";
        s1.display();
        s2.display();
    } 
}
