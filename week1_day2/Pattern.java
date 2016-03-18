/*Write a program to print the pattern */
import java.io.*;
import java.util.*;
class Pattern
{
   public static void main(String ar[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter value for print pattern:");
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
{
    for(int j=i;j<n;j++)
       System.out.print("  ");
     for(int j=1;j<i;j++)
      System.out.print(j+" ");
      System.out.print(i+" ");
     for(int j=i-1;j>=1;j--)
      System.out.print(j+" ");
System.out.print("\n");
}
}
}
