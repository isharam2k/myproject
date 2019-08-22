package student.training;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CheckSerialize {
	public static void main(String args[]) {

	Student object = new Student(1, "geeksforgeeks"); 
    String filename = "file.ser"; 
      
    // Serialization  
    try
    {    
        //Saving of object in a file 
        FileOutputStream file = new FileOutputStream(filename); 
        ObjectOutputStream out = new ObjectOutputStream(file); 
          
        // Method for serialization of object 
        out.writeObject(object); 
          
        out.close(); 
        file.close(); 
          
        System.out.println("Object has been serialized"); 

    } 
      
    catch(IOException ex) 
    { 
        System.out.println("IOException is caught"); 
    }
	}
}
