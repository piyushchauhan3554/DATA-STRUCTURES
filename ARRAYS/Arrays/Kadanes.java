public class Kadanes {
    public static void main(String[] args) {
        int arr[]={8, -8, 9, -9, 10, -11, 12};

        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        System.out.println(maxSum);
    }
    
}
