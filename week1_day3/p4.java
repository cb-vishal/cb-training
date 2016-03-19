import java.io.*;
class P4
{
   public void add(int a,int b)
    {
     System.out.println("Sum="+(a+b));
     }
    protected void sub(int a,int b)//only in same folder or by subclass
     {
       System.out.println("Sub"+(a-b));
     }
    private void mul(int a,int b)//access only within class
    {
      System.out.println("Mul"+(a*b));
     }
  }
