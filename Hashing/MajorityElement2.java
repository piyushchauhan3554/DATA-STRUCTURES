import java.util.*;
class MajorityElement2{
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,2,2,2,2,2,2,2,2,1,1,1,1,1,1};
        int n=arr.length;
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
        }

        for(Integer key:tm.keySet()){
            if(tm.get(key)>n/3){
                list.add(key);

            }
        }
        System.out.println(list);
    }
    
}
