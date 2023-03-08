class StaticExample
{
    String color="default";
    String engine="diesel";
    static String company="TATA";
}
public class Main {
    public static void main(String[] args)
    {
        // StaticExample s = new StaticExample();
        // s.color ="red";
        // s.engine="petrol";
        // s.company="vinay";//here company name is changing for all objects
        // StaticExample s2=new StaticExample();
        // System.out.println(s.color);
        // System.out.println(s.engine);
        // System.out.println(s.company);
        // System.out.println(s2.color);
        // System.out.println(s2.color);
        // System.out.println(s2.engine);
        // System.out.println(s2.company);
        StaticExample.company="vinu"; //we can call static function or static properties without creating object using class name 
        

    }
}
