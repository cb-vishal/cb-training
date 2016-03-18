/*Write a program to find the summation of indices of the characters in given input is odd or even. Indices start from 1(for a) to 26(for z).
Input: abc
Output: even (1+2+3 =6)*/
import java.io.*;
import java.util.*;
class CharSummation
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
   
