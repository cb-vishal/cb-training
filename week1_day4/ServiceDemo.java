import java.io.*;
import java.util.*;
class ServiceStation
{
    protected String name;
    protected String add;
    protected long cont;
   ServiceStation()
    {
     name=null;
     add=null;
     cont=0;
    }
    ServiceStation(String name,String add,long cont)
     {
        this.name=name;
         this.add=add;
          this.cont=cont;
     }
           
  }
class Person extends ServiceStation
 {
    protected String ename;
    protected int age;
    protected int isEmp;
    Person()
    {
      super();
       ename=null;
       age=0;
       isEmp=0;
     } 
   Person(String name,String add,long cont,String ename,int age,int isEmp)
      {
           super(name,add,cont);
            this.ename=ename;
            this.age=age;
            this.isEmp=isEmp;
         }
     }
class Vehicle extends Person
{
     private String vname;
     private String color;
     private int charge;
     Vehicle()
      {
        this.vname=null;
         this.color=null;
         this.charge=0;
       }
      Vehicle(String name,String add,long cont,String ename,int age,int isEmp,String vname,String color,int charge)
       {
         super(name,add,cont,ename,age,isEmp);
          this.vname=vname;
          this.color=color;
          this.charge=charge;
        }
    void listVehicle()
        {
          System.out.println(vname+"        "+charge);
         }
    void listAllEmp()
      {
         if(isEmp==0)
          System.out.println("Owner name="+ename+"     Employee"+"    Total charge="+charge); 
        if(isEmp==1)
          System.out.println("Owner name="+ename+"     Customer"+"    Total charge="+charge); 
        if(isEmp==2)
          System.out.println("Owner name="+ename+"     Both Employee and CUstomer"+"    Total charge="+charge); 
      }
 
        
       }   
   
   class ServiceDemo
  {
    public static void main(String ar1[])
{
    ArrayList<Vehicle> ar=new ArrayList<Vehicle>();
    Vehicle obj=new Vehicle("abc","chennai",98786677,"vishal",23,1,"bike","red",100);
    ar.add(obj);
    Vehicle obj2=new Vehicle("abc","chennai",98786677,"raju",23,2,"car","red",500);
    ar.add(obj2);
    Vehicle obj3=new Vehicle("abc","chennai",98786677,"xyz",23,1,"truck","red",500);
    ar.add(obj3);
     Iterator it=ar.iterator();
  System.out.println("Vehicle name       Service charge");
    while(it.hasNext())
{
    Vehicle v=(Vehicle)it.next();
    v.listVehicle();
}
Iterator it1=ar.iterator();
 while(it1.hasNext())
{
    Vehicle v=(Vehicle)it1.next();
    v.listAllEmp();
}
}
}

   
