class CountSort{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);

        }

        int count[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        
        int k=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[k]=i;
                count[i]--;
                k++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}