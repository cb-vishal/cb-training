/*Write a program to find the smallest power of x that is greater than y.

Example:

Sample Input : x = 4 & y = 60
Output : 3 (as smallest power of 4 greater than 60 is 3) */

import java.io.*;
import java.util.*;
class Day1_4
{
  public static void main(String ar[])
{
   Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of x:");
int x=s.nextInt();
 System.out.println("Enter the value of y:");
int y=s.nextInt();
  int r=x;
int pow=1;
while(r<y)
{
   r=r*x;
   pow++;
 }
  System.out.println("Minimum power="+pow);
}
}

