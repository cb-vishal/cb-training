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

