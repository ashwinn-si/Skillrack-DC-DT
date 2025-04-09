import java.util.*;
import java.io.*;

public class Hello {
    
    public static void main(String[] args){
        
        try{
            
            Scanner sc = new Scanner(System.in);
            
            String file_name_string = sc.nextLine();
            
            BufferedReader buffered_reader_object = new BufferedReader((new FileReader(file_name_string)));
            
            int total = 0;
            
            for(String row_string = buffered_reader_object.readLine() ; (row_string != null) ; row_string = buffered_reader_object.readLine()){
                total += Integer.parseInt(row_string.trim());
            }
            
            System.out.println(total);
        }catch(Exception exception_object){
            System.out.println("FileNotFound");
        }
    }
}