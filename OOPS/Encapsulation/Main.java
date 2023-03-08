package OOPS.Encapsulation;
class Student{
    String name;
    int rollno;
   private int marks;//we make it private because students are not allowed to change
     public Student(String name, int rollno, int marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    //setter
    private void setMarks(int marks)
    {
        this.marks=marks;
    }
    //getter
    public int getMarks()
    {
        return marks;
    }

}
public class Main {
    public static void main(String[] args)
    {
        Student s1=new Student("vinay",1967136,94);
        //s1.marks=100;//we cant becuase marks is a private property
        System.out.println(s1.getMarks());//we use getter to print private property
        s1.setMarks(19);//we are seeting using function //if we make that function private then we cant set any marks
        System.out.println(s1.getMarks());
    }
}
