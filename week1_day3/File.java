package file;

import java.io.File;
import java.io.IOException;

public class File 
{
    public void createFile()
    {	
    	try {
    		 
	      File file = new File("newfile.txt");
	      
	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }
	      
    	} catch (IOException e) {
	      e.printStackTrace();
	}
    }
}

