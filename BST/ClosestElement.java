public class ClosestElement {
    
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;

        }


    }
       static  int  closestNode=0;
        public static  int minDiff=Integer.MAX_VALUE;
        public static  int AbsDiff=0;
    public static int   minAbsDiff(int k,Node root){
        if(root==null) return 0 ;

        minAbsDiff(k, root.left);
        AbsDiff=Math.abs(k-root.data);
        if(minDiff>AbsDiff){
            AbsDiff=minDiff;
            closestNode=root.data;
        }

        minAbsDiff(k, root.right);
        return closestNode;
        


    }
    public static int closestElement(int k,Node root){
        return minAbsDiff(k, root);
       

    }


    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
        root.right.right=new Node(20);
        
        int k=19;

        System.out.println(closestElement(k, root));
        

        
    }
    
}
