public class PrefixSum {
    public static int maxSubSum(int[] arr){
        int Prefix[]=new int[arr.length];

        Prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            Prefix[i]=arr[i]+Prefix[i-1];
        }

        for(int i=0;i<Prefix.length;i++){
            System.out.print(Prefix[i]+" ");
        }
        System.out.println();

        int maxSum=0;
        int currSum=0;


        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                currSum=i==0? Prefix[j]:Prefix[j]-Prefix[i-1];
                maxSum=Math.max(maxSum, currSum);



            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println(maxSubSum(arr));
    }
    
}
