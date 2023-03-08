package OOPS.ACCESSMODIFIER;
class ACCESSMODIFIER{
   private int privateAccess=100;
   public void display()
   {
    System.out.println(privateAccess);
   } 
}
class childAccess extends ACCESSMODIFIER
{
    public void display()
    {
        System.out.println(privateAccess);
    }
    public void setPrivateAccess(int privateAccess)
    {
       
        super.privateAccess=privateAccess;
    }
    private  void sett()
    {
        System.out.println("i am private access");
    } 
}
public class Main {
    public static void main(String[] args)
    {
       ACCESSMODIFIER access = new ACCESSMODIFIER();
       access.display();//we can display because its printing inthe same classnot in main class
       System.out.println(access.privateAccess);
       childAccess ac=new childAccess();
       ac.sett();
       
    }
}
