package Overrid;
class abcd
{
    String name;
    public abcd(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return name;
    }
}
public class ex {
    public static void main(String[] args)
    {
  abcd example=new abcd("override");
  System.out.println(example);//if we try to print without toString method we will get address of object ,same for array but arrayList have toString method..

    }
}
