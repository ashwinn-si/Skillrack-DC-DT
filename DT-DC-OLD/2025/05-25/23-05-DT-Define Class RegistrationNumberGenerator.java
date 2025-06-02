```
import java.util.*;

class RegistrationNumberGenerator {
    
    Map<String , Integer> year_section_frequency_map;
    
    RegistrationNumberGenerator(){
        
        this.year_section_frequency_map = new HashMap<>();
    }
    
    public String generatRegistrationNumber(int year , char section){
        
        String key_string = String.format("%d%c" , year , section);
        
        this.year_section_frequency_map.put(key_string , (this.year_section_frequency_map.getOrDefault(key_string , 0) + 1));
        
        return String.format("%04d%c%03d" , year , section , this.year_section_frequency_map.get(key_string));
    }
}

public class Hello {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        RegistrationNumberGenerator gen = new RegistrationNumberGenerator();
        
        int N = Integer.parseInt(sc.nextLine().trim());
        
        for(int ctr = 1 ; ctr <= N ; ctr++){
            
            int year = sc.nextInt();
            
            char code = sc.nextLine().trim().charAt(0);
            
            System.out.println(gen.generatRegistrationNumber(year , code));
        }
    }
}
```