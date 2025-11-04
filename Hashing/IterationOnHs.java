import java.util.*;
public class IterationOnHs {
    public static void main(String[] args) {
        HashSet<String > set=new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Uttarakhand");
        set.add("Uttar Pradesh");
        set.add("Bengluru");

        // iterator interface 


        // Iterator it = set.iterator();
        // while(it.hasNext()){            
        //     System.out.println(it.next());
        // }

        // Advanced loop /Enhanced for loop /for Each loop

        for(String s:set){
            System.out.println(s);
        }        
    }
    
}
