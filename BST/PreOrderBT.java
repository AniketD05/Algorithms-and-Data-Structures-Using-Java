import java.util.ArrayList;

public class PreOrderBT {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void preOrderTraversal(Node root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        list.add(root.data);
        preOrderTraversal(root.left, list);
        preOrderTraversal(root.right, list);
    }

    static ArrayList<Integer> preOrder(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        preOrderTraversal(root, list);

        return list;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> result = preOrder(root);

        System.out.println("Pre Order Traversal of BT");

        for (int elements : result) {
            System.out.print(elements + " ");
        }

    }
}
