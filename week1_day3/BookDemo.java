import java.io.*;
import java.util.*;
class Author
{
   private String name;
   private String email;
   private char gen;
   Author(String name,String email,char gen)
    {
       this.name=name;
       this.email=email;
       this.gen=gen;
     }
     public void setEmail(String email)
      {
        this.email=email;
       }
     public String getName()
      {
       return name;
      }
      public String getEmail()
      {
       return email;
       }
    public char getGen()
      {
      return gen;
      }
    public String toDisplay()
     {
      return("["+name+"]"+"[("+gen+")] at ["+email+"]");
      }
}
 
 

class Book
{
  private String name;
  private ArrayList<Author> author;
  private double price;
  private int qty=0;
   Book(String name,ArrayList<Author> author,double price,int qty)
    {
       this.name=name;
       this.author=author;
       this.price=price;
       this.qty=qty;
    }
  public String getBookName()
   {
   return name;
   }
  public ArrayList<Author> getAuthor()
   {
   return author;
   }
  public void setPrice(double price)
   {
    this.price=price;
    }
  public int getQtyInStock()
    {
     return qty;
     }
  public void  setQtyInStock(int qty)
    {
      this.price=price;
    }
   public String toBookDisplay()
    {
       String str="";
       Iterator it=author.iterator();
        while(it.hasNext())
          {
          Author a=(Author)it.next();
          str=str+"Author1-"+a.getName()+"("+a.getGen()+") at "+a.getEmail()+",";
           }
        return("["+name+"] by "+str+"\n"+"price:"+price+"\n"+"No of books available:"+qty);
           
        
    }
  public void printAuthors()
    {
       Iterator it=author.iterator();
       while(it.hasNext())
      {
        Author a=(Author)it.next();
        System.out.println(a.getName()+"   "+a.getGen()+"   "+a.getEmail());
      }
    }
  public void addAuthor(Author author)
   {
     this.author.add(author); 
    }
  
}

 class BookDemo
{
  public static void main(String ar[])
   {
     ArrayList<Author> au=new ArrayList<Author>();
     ArrayList<Book>   book=new ArrayList<Book>();     
     Author author1=new Author("vishal","vishalceg",'M');
     au.add(author1);
     System.out.println(author1.toDisplay());
     author1.setEmail("vishal@chargebee");
     Author author2=new Author("raju","rajuceg",'M');
     au.add(author2);
     Author author3=new Author("xyz","rajuceg",'M');
     Book b=new Book("c++",au,500,5);
     book.add(b);
     b.addAuthor(author3);
      System.out.println(b.toBookDisplay());
     b.printAuthors();
}
}
