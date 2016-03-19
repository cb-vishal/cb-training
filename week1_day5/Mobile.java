import java.io.*;
import java.util.*;
class Mobile
{
   private String name;
   private int remainingCharge;
   public void setName(String name)
    {
      this.name=name;
    }
   public int remainingCharge()
     {
      return 0;
     }
   public void getMobileDetails()
    {
     System.out.println("Name:"+name+"   remainingCharge:"+remainingCharge);
     }
 public static void main(String ar[])
  {
   ArrayList<Mobile> a=new ArrayList<Mobile>();
    Random rn = new Random();
    
   
    Mobile m = new Mobile() {
      public int remainingCharge()
      {
        return rn.nextInt(100) + 1;
        
      }			
    }; 
    
     m.remainingCharge=m.remainingCharge();
     m.setName("Nokia");
     a.add(m);
    Mobile m2 = new Mobile() {
      public int remainingCharge()
      {
        return rn.nextInt(100) + 1;
        
      }			
    }; 
    
     m2.remainingCharge=m2.remainingCharge();
     m2.setName("samsung");
     a.add(m2);
     Iterator it=a.iterator();
     while(it.hasNext())
      {
        Mobile obj=(Mobile)it.next();
        obj.getMobileDetails();
     
      }
  }
}
 
