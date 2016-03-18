import java.io.*;
import java.util.*;
class Day2_3
{
   public static void main(String ar[])
{
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter text::");
     String str=s1.nextLine();
int s=0;
      for(int i=0;i<str.length();i++)
{
       char ch=str.charAt(i);
       int a=(int)ch;
       s=s+a-96;
}
   System.out.println("Sum="+s);
}
}
   
