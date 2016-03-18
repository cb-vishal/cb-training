/*Write a program to print Fibonacci series upto N number*/
import java.io.*;
import java.util.*;
class Fibo
{
    public static void main(String ar[])
{
     Scanner s=new Scanner(System.in);
     int x=0,y=1,sum,n,i=2;
     System.out.println("Enter a number::");
     n=s.nextInt();
     if(n==1)
      System.out.println(x);
     else
     if(n==2)
     System.out.println(x+" "+y);
     else
     {
     System.out.print(x+" "+y);
      while(i<n)
      {
        sum=x+y;
         System.out.print(" "+sum);
        x=y;
        y=sum;
        i++;
       }
    }
}
}

