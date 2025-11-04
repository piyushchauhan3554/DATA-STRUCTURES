import java.util.*;
public class LinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>(); // ordered on the base of insertion of keys  
        lhm.put("Ind", 100);
        lhm.put("Aus", 30);
        lhm.put("Eng", 10);
        lhm.put("SA", 190);
        lhm.put("Nz", 800);

        System.out.println(lhm);
        System.out.println(lhm.get("Ind"));
        System.out.println(lhm.containsKey("SA"));
        int val=lhm.remove("Nz");
        System.out.println(val);
        lhm.clear();
        System.out.println(lhm.isEmpty());

        
    }
    
}
