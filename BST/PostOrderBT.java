import java.util.ArrayList;

public class PostOrderBT {

    static class Node {

        int data;
        Node right;
        Node left;

        Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static void postOrderTraversal(Node root, ArrayList<Integer> arr){

        if(root == null){
            return;
        }

        postOrderTraversal(root.left, arr);
        postOrderTraversal(root.right, arr);
        arr.add(root.data);
    }

    public static ArrayList<Integer> postOrder(Node root){

        ArrayList<Integer> arr = new ArrayList<>();

        postOrderTraversal(root,arr);

        return arr;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> result = postOrder(root);

        for(int elements : result){
            System.out.print(elements + " ");
        }
        System.out.println();
    }
}
