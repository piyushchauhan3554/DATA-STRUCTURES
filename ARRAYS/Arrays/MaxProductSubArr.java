public class MaxProductSubArr {
    public static int maxProduct(int[] arr){
        int maxProduct=Integer.MIN_VALUE;
        int currProduct=1;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currProduct=1;
                
                for(int k=i;k<=j;k++){
                    currProduct*=arr[k];

                }
                maxProduct=Math.max(maxProduct,currProduct);
            }
        }
        return maxProduct;

    }
    public static void main(String[] args) {
        int arr[]={2, 3, 4};
        System.out.println(maxProduct(arr));

    }
    
}
