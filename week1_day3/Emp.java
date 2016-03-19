import java.io.*;
import java.util.*;
class Emp
{
    private String name;
    private String gen;
    private int tAmt;
    private int tax;
     static int c=0;
     Emp()
      {
       name=null;
       gen=null;
       tAmt=0;
       tax=0;
       }
   public  void input(String name,String gen,int amt)
    {
       this.name=name;
       this.gen=gen;
       this.tAmt=amt;
        if(gen.equals("male"))
           tax=amt*10/100;
        else
         tax=amt*5/100;
       
        c=c+tax;
     }
     public void dis()
       {
       System.out.println("["+name+"]"+"["+gen+"]"+"["+tAmt+"]"+"["+tax+"]");
       }  
    public static void totalTax()
     {
      System.out.println("Total tax::"+c);
      }
public static void main(String ar1[])
  {
    Scanner s=new Scanner(System.in);
     Emp obj=null;
ArrayList<Emp> ar=new ArrayList<Emp>();
     while(true)
     {
       System.out.println("1.Input");
       System.out.println("2.Details");
       System.out.println("3.Total tax:");
       System.out.println("4.exit");
        int ch=s.nextInt();
         switch(ch)
          {
           case 1:System.out.println("Enter name of emp:");
             s.nextLine();
            String name=s.nextLine();
  
             System.out.println("Enter gender:");
             String gen=s.nextLine();
            System.out.println("Enter taxtable amount:");
             int amt=s.nextInt();
            obj=new Emp();
            obj.input(name,gen,amt);
              ar.add(obj);
             break;
           case 2:
                 Iterator it=ar.iterator();
                   while(it.hasNext())
                   {
                     Emp obj1=(Emp)it.next();
                     obj1.dis();
                    }
                  break;
            case 3:
                    totalTax();
                      break;  
          case 4:
                System.exit(0);
              }
           }
}
}
       
    

   
