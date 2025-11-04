public class SubArray2 {
    public static void printSubArray(int arr[]){
        int n=arr.length;
        int ts=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");

                }
                ts+=1;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total no. of subarray are :"+ts);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArray(arr);
    }
    
}
