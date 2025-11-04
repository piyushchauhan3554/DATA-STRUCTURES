import java.util.*;
public class LinkedHS {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Uttarakhand");
        lhs.add("Uttar Pradesh");
        lhs.add("Bengluru");

        System.out.println(lhs);

        TreeSet<String> ts=new TreeSet<>();

        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Uttarakhand");
        ts.add("Uttar Pradesh");
        ts.add("Bengluru");

        System.out.println(ts);        
    }
    
}
