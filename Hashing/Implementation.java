import java.util.*;
public class Implementation {
    static class HashMap<K,V>{ // Generic {general for boolean , String , int , float }
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n; // n is the no. of nodes 
        private LinkedList<Node> buckets[];
        private int N;

        @SuppressWarnings("unchecked") // do not check the type of linkedlist

        public HashMap(){
            this.n=0;
            this.N=4;
            
            this.buckets=new LinkedList[N]; // sometimes we have to also write the type of linkedlist

            for(int i=0;i<N;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc=key.hashCode(); // hc = -12334532 
            return Math.abs(hc)%N;

        }

        private int searchInLL(K key , int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;

        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=N*2;
            // initialize steps 
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();

            }

            // nodes -> add in  bucket 
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll  = oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node =ll.get(j);
                    put(node.key, node.value);
                }
            }



        }

        // put function 

        public void put(K key,V value){
            int bi=hashFunction(key); // between 0 to size-1 (N-1)
            int di=searchInLL(key,bi); // di is data index 
            if(di!=-1){
                Node node =buckets[bi].get(di);
                node.value=value;
            }
            else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda=(double)n/N;// 2.25 = should not be 2 

            if(lambda>2.0){
                rehash();
            }


        }


        // containsKey function 

        public boolean containsKey(K key){
           int bi= hashFunction(key);
           int di= searchInLL(key, bi);

           if(di==-1) return false;
           else return true;
        }


        // get function 

        public V get(K key){

            int bi=hashFunction(key); // between 0 to size-1 (N-1)
            int di=searchInLL(key,bi); // di is data index 
            if(di!=-1){
                Node node =buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }

        }

        // remove function 

        public V remove(K key){
            int bi=hashFunction(key); // between 0 to size-1 (N-1)
            int di=searchInLL(key,bi); // di is data index 
            if(di!=-1){
                Node node =buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
           


        }

        // isEmpty function

        public boolean isEmpty(){
            return n==0;
        }

        // keySet function 

        public ArrayList<K> keySet(){
            ArrayList<K> list=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node: ll){
                    list.add(node.key);
                }
            }
            return list;
        }
        

    }
    public static void main(String[] args) {
        HashMap<String , Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);
        hm.put("Nepal", 5);
        
       
        System.out.println( hm.get("India"));
        System.out.println( hm.get("Us"));

        System.out.println(hm.isEmpty());
        hm.remove("India");
        System.out.println(hm.get("India"));

        ArrayList<String> keys=hm.keySet();
        for(String k:keys){
            System.out.print(k+" ");
        }
        
    }
    
}
