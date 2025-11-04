import java.util.ArrayList;;
public class KthSmallestElement {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;

        }
    }

    // inorder func

    public static void inorder(ArrayList<Integer> list,Node root,int k){
        if(root==null) return;
        inorder(list, root.left, k);
        list.add(root.data);
        inorder(list, root.right, k);

    }

    public static int KthSmallestElement(Node root,int k ){
        ArrayList<Integer> list=new ArrayList<>();
        inorder(list, root, k);
        return list.get(list.size()-k);


    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
        root.right.right=new Node(20);
        System.out.println(KthSmallestElement(root,3));
        System.out.println(KthSmallestElement(root,5));
        
        

        
    }
    
}
