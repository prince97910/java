import java.io.File;  
import java.io.PrintWriter;  
public class PrintWriterExample {  
    public static void main(String[] args) throws Exception {  
            
      PrintWriter writer = new PrintWriter(System.out);    
      writer.write("hope is only the way.");        
 writer.flush();  
      writer.close();  
    
      PrintWriter writer1 =null;      
         writer1 = new PrintWriter(new File("D:\\testout.txt"));  
         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
                         writer1.flush();  
         writer1.close();  
    }  
}  
