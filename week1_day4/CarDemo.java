import java.io.*;
class Car
{
   protected int speed;
   protected double regularPrice;
   protected String color;
         Car(int speed,double reg,String color)
          {
             this.speed=speed;
             this.regularPrice=reg;
              this.color=color;
           }
    public void getDetails()
     {
      System.out.println("Speed="+speed);
      System.out.println("RegularPrice="+regularPrice);
      System.out.println("Color="+color);
      }

   public double getSalePrice()
    {
     return regularPrice;
    }
}


class Truck extends Car
{
    private int weight;
     
       Truck(int w,int speed,double reg,String color)
         {
           super(speed,reg,color);
           this.weight=w;
        }
      public double getSalePrice()
        {
          if(weight>2000)
           return(regularPrice*90/100);
          else
            return(regularPrice*80/100);
         }
 }
class Fort extends Car
{
    private int year;
    private int manf;
      
       Fort(int year,int manf,int speed,double reg,String color)
         {
           super(speed,reg,color);
           this.year=year;
           this.manf=manf;
        }
      public double getSalePrice()
        {
          
           return(regularPrice-manf);
          
         }
 }
class Sadan extends Car
{
    private int len;
       Sadan(int len,int speed,double reg,String color)
         {
           super(speed,reg,color);
           this.len=len;
        }
      public double getSalePrice()
        {
          if(len>20)
           return(regularPrice*95/100);
          else
            return(regularPrice*90/100);
         }
 }
class CarDemo
{
    public static void main(String ar[])
{
     Car obj1=new Sadan(20,50,100,"red");
     obj1.getDetails();
     System.out.println("Saleprice="+obj1.getSalePrice());
     Car obj2=new Fort(2016,40,50,100,"red");
     obj2.getDetails();
     System.out.println("Saleprice="+obj2.getSalePrice());
     Car obj3=new Fort(2015,20,50,100,"red");
     obj3.getDetails();
     System.out.println("Saleprice="+obj3.getSalePrice());
}
}
