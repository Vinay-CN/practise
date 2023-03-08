
package OOPS.Poly;

class Parent{

 int income=100000;
 int expenditures=100000;
public Parent(){System.out.println("i am parent");}
 public Parent(int income,int expenditures) {//method overloading
 this.income=income;
 this.expenditures=expenditures;
}

 public int Exe(int income,int expenditures) 
 {
   this.income=income;
   this.expenditures=expenditures;
   return income-expenditures;
 }  
}
class Child extends Parent
{
    int networth=10+10;
  public Child(){System.out.println("i am child");}
    public Child(int networth,int income,int expenditures)//method overloading
    {
        super(income, expenditures);
        this.networth=networth;
    }
    @Override
    public int Exe(int income,int expenditures) //method overridden
    {
        super.income=income;
        super.expenditures=expenditures;
        return income-expenditures+networth;
    }

}
public class Maina {
  public static void main (String[] args) throws java.lang.Exception
	{
		 Parent p=new Parent();
       System.out.println(p.Exe(10,20));
       Child c=new Child(20,30,5000);
       System.out.println(c.Exe(10,20));
	}
}
