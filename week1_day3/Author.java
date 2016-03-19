import java.io.*;
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
  private Author author;
  private double price;
  private int qty=0;
   Book(String name,Author author,double price,int qty)
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
  public Author getAuthor()
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
   public String toDisplay()
    {
       return "bdhh";
    }
  public void printAuthors()
    {
    }
  public void addAuthor(Author author)
   {
    }
  
}

 class BookDemo
{
  public static void main(String ar[])
   {
          
     Author author=new Author("vishal","vishalceg",'M');
     author.toDisplay();
     author.setEmail("vishal@chargebee");
}
}
