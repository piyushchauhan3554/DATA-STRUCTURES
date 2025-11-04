import java.util.HashSet;
public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Uttarakhand");
        set.add("Uttar Pradesh");
        set.add("Bengluru");
        System.out.println(set);
        
        
        System.out.println(set.contains("UP"));
        set.add(null);
        System.out.println(set);
        set.remove(null);
        set.remove("Bengluru");
        System.out.println(set);

        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.size());
    }
    
}
