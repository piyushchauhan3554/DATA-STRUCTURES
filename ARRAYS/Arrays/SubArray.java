public class SubArray {
    public static void printSubArray(int arr[]){
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                count+=1;
                if(arr[i]==arr[j]){
                    System.out.print("{"+arr[i]+"}"+",");
                    
                }
                else{
                System.out.print("{"+arr[i]+","+arr[j]+"}"+",");
                }

            }
            System.out.println();
        }
        System.out.println("total no. of subarrays are:-"+count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArray(arr);
    }
    
}
