class Pairs{
    public static void printPairs(int[] arr){
        int n=arr.length;
        int count=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("{"+arr[i]+","+arr[j]+"}");
                count+=1;
            }
            System.out.println();
        }
        System.out.println("total no. of pairs are :-"+count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printPairs(arr);


    }
}