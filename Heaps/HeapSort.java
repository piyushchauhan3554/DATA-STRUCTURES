public class HeapSort {

    public static void heapify(int arr[],int idx,int size){
        int left=2*idx+1;
        int right=2*idx+2;
        int minIdx=idx;

        if(left<size && arr[left]<arr[minIdx]){
            minIdx=left;
        }

        if(right<size && arr[right]<arr[minIdx]){
            minIdx=right;
        }

        if(minIdx!=idx){
            // swap

            int temp=arr[idx];
            arr[idx]=arr[minIdx];
            arr[minIdx]=temp;

            heapify(arr, minIdx, size);
        }

    }

    public static void heapSort(int arr[]){
        // find minheap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);

        }

        // swap last element with first element 

        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;


            heapify(arr,0,i);
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,1,5};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
