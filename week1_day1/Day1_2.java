/*Write a program that would add two numbers x & y and print the sum z where x + y = z. */
import java.io.*;
import java.util.*;
class Day1_2
{
    public static void main(String ar[])
{
     Scanner s=new Scanner(System.in);
     System.out.println("Enter first number::");
     int x=s.nextInt();
     System.out.println("Enter second number::");
     int y=s.nextInt();
     int z=x+y;
    System.out.println("sum="+z);
}
}

