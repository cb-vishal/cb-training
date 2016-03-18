/*Write a program with a conditional statement.*/
import java.io.*;
import java.util.*;
class Day1_3
{
  public static void main(String ar[])
{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the age of voter:");
   int a=s.nextInt();
   if(a>=18)
   System.out.println("Person is eligible for vote");
else
System.out.println("Person is not eligible for vote");
}
}

