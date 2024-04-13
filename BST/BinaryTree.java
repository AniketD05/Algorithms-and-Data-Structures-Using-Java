import java.util.ArrayList;

public class BinaryTree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void displayPreOrderTraversal(Node root, ArrayList<Integer> list) {

        if(root == null){
            return;
        }
        
        list.add(root.data);

        displayPreOrderTraversal(root.left,list);

        displayPreOrderTraversal(root.right,list);
    }
    static void displayInOrderTraversal(Node root, ArrayList<Integer> list) {

        if(root == null){
            return;
        }

        displayInOrderTraversal(root.left,list);

        list.add(root.data);

        displayInOrderTraversal(root.right,list);
    }

    static void displayPostOrderTraversal(Node root, ArrayList<Integer> list) {

        if(root == null){
            return;
        }

        displayPostOrderTraversal(root.left,list);

        displayPostOrderTraversal(root.right,list);

        list.add(root.data);
    }

    static ArrayList<Integer> preOrder(Node root){

        ArrayList<Integer> list = new ArrayList<>();

        displayPreOrderTraversal(root,list);

        return list;
    }
    static ArrayList<Integer> inOrder(Node root){

        ArrayList<Integer> list = new ArrayList<>();

        displayInOrderTraversal(root,list);

        return list;
    }

    static ArrayList<Integer> postOrder(Node root){

        ArrayList<Integer> list = new ArrayList<>();

        displayPostOrderTraversal(root,list);

        return list;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        ArrayList<Integer> preOrderResult = preOrder(root); // For Pre-Order

        System.out.println("Pre-Order Traversal : ");

        for (Integer elements : preOrderResult) { 
            System.out.print(elements + " " );
        }
        System.out.println();

        ArrayList<Integer> inOrderResult = inOrder(root);

        System.out.println("In-Order Traversal : ");

        for (Integer elements : inOrderResult) {
            System.out.print(elements + " " );
        }
        System.out.println();

        ArrayList<Integer> postOrdeRresult = postOrder(root);

        System.out.println("Post-Order Traversal : ");

        for (Integer elements : postOrdeRresult) {
            System.out.print(elements + " " );
        }
        System.out.println();
       
    }
}
