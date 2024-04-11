import org.w3c.dom.Node;

public class DoublyLinkedList {

    Node head;

    public class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {

            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtfront(int newData) {

        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void insertAfter(int newData) {

        Node newNode = new Node(newData);
        Node n = head;

        if (n == null) {
            System.out.println("Cannot insert node");
            return;
        }

        newNode.next = n.next;
        n.next = newNode;

        newNode.prev = n;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

    }

    public void displayList() {
        Node n = head;
        Node p = null;

        System.out.println("\n-------------------Forward Direction-------------------");
        while (n != null) {
            System.out.print(n.data + " ");
            p = n;
            n = n.next;
        }
        System.out.println();
        System.out.println("\n-------------------Backward Direction-------------------");
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtfront(13);
        dll.insertAtfront(12);
        dll.insertAtfront(11);
        dll.insertAtfront(10);

        dll.displayList();

        System.out.println("After inserting node");
        dll.insertAfter(50);
        dll.displayList();
    }
}
