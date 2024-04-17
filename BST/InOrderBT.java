
import java.util.ArrayList;

public class InOrderBT {

    static class Node {

        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static void inOrderTraversal(Node root, ArrayList<Integer> arr) {

        if(root == null){
            return;
        }

        inOrderTraversal(root.left, arr);
        arr.add(root.data);
        inOrderTraversal(root.right, arr);
    }

    public static ArrayList<Integer> preOrder(Node root) {

        ArrayList<Integer> arr = new ArrayList<>();

        inOrderTraversal(root, arr);

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
        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList<Integer> result = preOrder(root);

        for(int elements : result){
            System.out.print(elements + " ");
        }
        System.out.println();
    }
}
