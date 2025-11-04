public class MaxSubArraySum {
    public static int maxSum(int[] nums){
        int n=nums.length;
        int maxSum=0;
        int currSum=0;


        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=nums[k];
                }
                maxSum=Math.max(maxSum,currSum);
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int arr[]={-3,3,-4,6,-5,10,5,-2};
        System.out.println(maxSum(arr));

        
    }
    
}
