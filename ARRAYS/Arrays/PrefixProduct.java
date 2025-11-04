public class PrefixProduct {
    public static int maxProduct(int[] arr){

        int Prefix[]=new int[arr.length];

        Prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            Prefix[i]=Prefix[i-1]*arr[i];
        }

        int max=Integer.MIN_VALUE;
        int currProduct=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currProduct=i==0? Prefix[j]:Prefix[j]/Prefix[i-1];
                max=Math.max(max,currProduct);
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));

    }
    
}
