import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,3,21,3,2};
        HashSet<Integer> set=new HashSet<>();

        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);

        System.out.println(set.size());
        
        
    }
    
}
