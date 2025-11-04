import java.util.HashMap;
import java.util.Set;

public class Iterate {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Apple", 11);
        hm.put("Banana", 12);
        hm.put("Cake", 71);
        hm.put("Chocolate", 14);
        hm.put("Coca cola", 1);

        
        Set<String> keys=hm.keySet();
        
        
        for (String k : keys) {
            System.out.println("key is  "+ k + " and  value is  "+hm.get(k));
            
        }
        
    }
    
}
