import java.io.*;
import java.util.*;
class Animal
{
    private String name;
    private String owner;
  
   
     public  void setName(String name)
        {
       this.name=name;
        }
     public void setOwner(String owner)
      {
         this.owner=owner;
      }

      public String getName()
        {
            return name;
        }

      public String getOwner()
       {
          return owner;
        }
       
public static void main(String ar1[])
  {
    Scanner s=new Scanner(System.in);
     Animal obj=null;
ArrayList<Animal> ar=new ArrayList<Animal>();
     while(true)
     {
       System.out.println("1.Create animal");
       System.out.println("2.Animal details");
       System.out.println("3.Number of animal created");
       System.out.println("4.exit");
        int ch=s.nextInt();
         switch(ch)
          {
           
           case 1:System.out.println("Enter name of animal:");
             s.nextLine();
            String name=s.nextLine();
  
             System.out.println("Enter owner name of animal:");
             String own=s.nextLine();
            obj=new Animal();
            obj.setName(name);
            obj.setOwner(own);
              ar.add(obj);
              
             break;
           case 2: Iterator it=ar.iterator();
                    System.out.println("Animal_Name     Owner");
                    while(it.hasNext())
                     {
                         Animal a=(Animal)it.next();
                          System.out.println("     "+a.getName()+"        "+a.getOwner());
                       }
                   break;
           case 3:
                 System.out.println(ar.size());
                  break;
          case 4:
                System.exit(0);
              }
           }
}
}
       
    

   
