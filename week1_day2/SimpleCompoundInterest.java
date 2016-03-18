/*Write a program to find out simple and compound interest.*/
import java.io.*;
import java.util.*;
class SimpleCompoundInterest
{
  public static void main(String ar[])
   {
     Scanner s=new Scanner(System.in);
      System.out.println("Enter principle::");
       float p=s.nextFloat();
 System.out.println("Enter rate::");
       float r=s.nextFloat();
 System.out.println("Enter time::");
       float t=s.nextFloat();
  float si=(p*r*t)/100;
    float ci=1+r/100;
      float base=ci;
    for(int i=1;i<t;i++)
      ci=ci*base;
     ci=ci*p-p;
   System.out.println("simple interest="+si);
System.out.println("Compound Interest::"+ci);
}
}
