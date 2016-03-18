import java.io.*;
import java.util.*;
class Day2_2
{
   public static void leftRotate(int m[][],int n)
    {
      int i=0,t;
        int m1=n;
       while(i<n-1)
       {
          for(int j=i;j<n;j++)
          {
             t=m[i][j];
             m[i][j]=m[j][n-1];
             m[j][n-1]=m[n-1][n-1-j];
             m[n-1][n-1-j]=m[n-1-j][i];
             m[n-1-j][i]=t;
           }
         i++;
          n--;
       }
       for( i=0;i<m1;i++)
          {
            for(int j=0;j<m1;j++)
            System.out.print(m[i][j]+" ");
            System.out.print("\n");
           }
     }
   public static void main(String ar[])
    {
     Scanner s=new Scanner(System.in);
     int [][]m=new int[10][10];
     for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
          m[i][j]=s.nextInt();
   /*  for(int i=0;i<4;i++)
{
        for(int j=0;j<4;j++)
        System.out.print(m[i][j]+" ");
        System.out.print("\n");
}*/
leftRotate( m,3);

}
}
