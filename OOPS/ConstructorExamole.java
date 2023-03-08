package OOPS;
class Employee 
{
    String name="default";
    int age=11111;
    // public Employee()//default constructor is deleted
    // {
    //     System.out.println("i am default constructor and i will be printed if constructor"+
    //     "created for this class, even without calling ");

    // } 
    //PArameteerized construct
    
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println(name+" "+age);
        System.out.println("i am parameterized constructor with parameters ");
    }
    //this keyword
    public Employee( int nage)
    {
        nage++; //printing this 
               
    }
}
public class ConstructorExamole {
    public static void main(String[] args) {
        Employee emp1 = new Employee("mahesh",21);//parameterized constructor
        //Employee emp2=new Employee();//default  constructor
        Employee emp3=new Employee(21);
       // System.out.println(emp3.);
    }   
    
}
