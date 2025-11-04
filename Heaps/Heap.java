import java.util.*;

public class Heap {
    ArrayList<Integer> arr=new ArrayList<>();

    // add function 

    public void add(int val){
        arr.add(val);

        int x=arr.size()-1;
        int par=(x-1)/2;

        while(x>0 && arr.get(x)<arr.get(par)){
            // swapping 

            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par, temp);

            x=par;
            par=(x-1)/2;

        }
        
    }

    // peek function
    public int peek(){
        return arr.get(0);
    }

    // isEmpty function 

    public boolean isEmpty(){
        return arr.size()==0;
    }

    // heapify function

    public void heapify(int idx){
        int left=2*idx+1;
        int right=2*idx+2;
        int minIdx=idx;

        if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
            minIdx=left;
        }

        if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
            minIdx=right;
        }

        if(minIdx!=idx){

            // swapping 

            int temp=arr.get(minIdx);
            arr.set(minIdx,arr.get(idx));
            arr.set(idx,temp);

            heapify(minIdx);
        }
            

    }
    // remove function 

    public void remove(){

        // if (arr.size() == 0) {
        //     return;
        // }
        

        // swap first and last element 

        int temp=arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        // remove last element 

        arr.remove(arr.size()-1);

        // heapify function calling 

        heapify(0);

    }

    public static  void main(String[] args) {

        Heap h=new Heap();
        h.add(5);
        h.add(4);
        h.add(3);
        h.add(2);
        h.add(1);

        while(!(h.isEmpty())){
            System.out.println(h.peek());
            h.remove();
        }

        
    }
}
