import java.util.*;
public class SubarraySum {
    public static void main(String[] args) {
        int nums[]={10,2,-2,-20,10};
        int k=-10;
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println("no. of subarrays whose sum equal to k :- "+ans);
        
    }
    
}
