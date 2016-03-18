/*Print the smallest and largest number in an integer array.*/
import java.io.*;
import java.util.*;
class Arrayminmax
{
   public static void main(String ar[])
{
    int []a=new int[10];
    Scanner s=new Scanner(System.in);
     int min=99999,max=0;
    System.out.println("Enter 5 value of array::");
     for(int i=0;i<5;i++)
     {
       a[i]=s.nextInt();
         if(min>a[i])
            min=a[i];
          if(max<a[i])
            max=a[i];
     }
    System.out.println("min="+min);
     System.out.println("max="+max);
}
}
