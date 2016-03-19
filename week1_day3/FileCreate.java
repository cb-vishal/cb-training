package pack;  
import java.io.File;
import java.io.IOException;
public class FileCreate{
  public void createFile(){
try{
         File file = new File("myfile.txt");
         if(file.createNewFile())
         System.out.println("File successfully created");
         else
         System.out.println
         (" File already exists.");
     }
     catch(IOException ioe) {
        ioe.printStackTrace();
     }
}  
}  
