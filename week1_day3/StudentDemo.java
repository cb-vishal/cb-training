import java.io.*;
class Subject
{
    private String sub1;
    private float marks1;
    private String sub2;
    private float marks2;
    private String sub3;
    private float marks3;
    public void setSub1(String sub1)
     {
       this.sub1=sub1;
     } 

 public void setMarks1(float marks1)
     {
       this.marks1=marks1;
     } 

 public void setSub2(String sub2)
     {
       this.sub2=sub2;
     } 

 public void setMarks2(float marks2)
     {
       this.marks2=marks2;
     } 

 public void setSub3(String sub3)
     {
       this.sub3=sub3;
     } 
public void setMarks3(float marks3)
     {
       this.marks3=marks3;
     } 

public String getSub1()
     {
       return sub1;
     } 

 public float getMarks1()
     {
       return marks1;
     } 

 public String getSub2()
     {
       return sub2;
     } 

 public float getMarks2()
     {
       return marks2;
     } 

 public String getSub3()
     {
       return sub3;
     } 
public float getMarks3()
     {
       return marks3;
     } 
 }
    
class Student
  {
    private int sId;
    private String name;
    private String gen;
    private Subject subs;
    public void setSid(int sId)
    {
      this.sId=sId;
    }
    public void setName(String name)
     {
       this.name=name;
     }
    public void setGen(String gen)
    {
      this.gen=gen;
     }
    public void setSubs(Subject subs)
      {
       this.subs=subs;
      }
   public Subject getSubs()
    {
       return subs;
    }
 public int getSid()
    {
      return sId;
    }
    public String getName()
     {
       return name;
     }
    public String getGen()
    {
      return gen;
     }
}
class ResultGenerator
{
   public static void generateResult(Student s)
    {
        float tot=0;
        
        Subject subs=s.getSubs();
        System.out.println("SudentId:"+s.getSid()+"    Name:"+s.getName()+"   Gender:"+s.getGen());
        System.out.println("Subject1:"+subs.getSub1()+"    Marks:"+subs.getMarks1());
        System.out.println("Subject2:"+subs.getSub2()+"    Marks:"+subs.getMarks2());
        System.out.println("Subject3:"+subs.getSub3()+"    Marks:"+subs.getMarks3());
        tot+=subs.getMarks1();
        tot+=subs.getMarks2();
        tot+=subs.getMarks3();
        System.out.println("Total="+tot);
        System.out.println("Avg="+(tot/3));
      }
}
   

class StudentDemo
 {
      public Student storeStudentData(Student s)
       {
       Subject sub=new Subject();
     sub.setSub1("c");
     sub.setMarks1(60);  
     sub.setSub2("java");
     sub.setMarks2(70);  
     sub.setSub3("os");
     sub.setMarks3(90);
     s.setSid(101);
     s.setName("vishal");
     s.setGen("male");
     s.setSubs(sub);
return s;
       } 
  public static void main(String ar[])
   {
    
     StudentDemo st=new StudentDemo();
    Student s=(Student)st.storeStudentData(new Student());
    
    ResultGenerator.generateResult(s);
            
  }
}
