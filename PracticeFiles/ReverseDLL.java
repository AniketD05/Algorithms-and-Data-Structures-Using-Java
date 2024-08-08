

class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class ReverseDLL {

    public static Node ReverseDLL(Node head) {

        Node n = head;
        Node temp = null;

        if (head == null && head.next == null) {
           
            return head;
        }

        while (n != null) {

            temp = n.prev;
            n.prev = n.next;
            n.next = temp;

            n = n.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;

    }

    public static void main(String[] args) {

        Node newNode = new Node(10);
        Node newNode1 = new Node(20);
        Node newNode2 = new Node(30);
        Node head = newNode;

        newNode.next = newNode1;
        newNode1.prev = newNode;

        newNode1.next = newNode2;
        newNode2.prev = newNode1;

        Node newHead = ReverseDLL(head);

        Node n = newHead;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();

    }
}
