import java.util.HashSet;
public class Union_Intersection {
    public static void main(String[] args) {
        int arr1[]={3,7,9};
        int arr2[]={4,5,6,3,9,2,5};
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println("Union is " + set.size());

        System.out.print("Union elements are :- ");
        System.out.println();
        for(int i:set){
            System.out.print(i+" ");
        }
        System.out.println();

        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count=0;
        System.out.println("Intersection elements are :-");
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
                System.out.print(arr2[i]+" ");
            }
        }
        System.out.println();

        System.out.println("Intersection is "+count);




        


        
    }
    
}
