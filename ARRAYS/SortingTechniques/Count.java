class Count{
    public static void countingSort(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int freq[]=new int[max+1];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<freq.length;i++){
            
            while(freq[i]>0){
                arr[k]=i;
                k++;
                freq[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={5,4,6,4,3,3,2,1,6,5,6};
        countingSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}