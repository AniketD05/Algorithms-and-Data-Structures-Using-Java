
public class DoublyLL {

    Node head;

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

    public void insertAtBegining(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void insertSequencially(int data) {

        Node newNode = new Node(data);

        Node n = head;

        if (head == null) {
            head = newNode;
            return;
        }

        while (n.next != null) {
            n = n.next;
        }

        n.next = newNode;
        newNode.prev = n;

    }

    public void insertAfterKeyNode(int data, int key) {

        Node newNode = new Node(data);

        Node n = head;

        if (head == null) {
            head = newNode;
            return;
        }

        while (n != null && n.data != key) {
            n = n.next;
        }

        if (n == null) {
            System.out.println("Key is not present, insert Operation cannot be done!");
            return;
        }

        if (n.next == null) {
            n.next = newNode;
            newNode.prev = n;

        } else {
            
            newNode.next = n.next;
            n.next.prev = newNode;
            n.next = newNode;
            newNode.prev = n;
        }

        System.out.println(data + " inserted after " + key);
    }

    public void display() {

        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();

        dll.insertAtBegining(10);
        dll.insertAtBegining(20);
        dll.insertAtBegining(30);
        dll.insertAtBegining(40);
        dll.display();

        System.out.println();

        dll.insertSequencially(11);
        dll.insertSequencially(12);
        dll.insertSequencially(13);
        dll.insertSequencially(14);
        dll.display();

        dll.insertAfterKeyNode(21, 14);
        dll.insertAfterKeyNode(22, 122);
        dll.insertAfterKeyNode(22, 21);
        dll.insertAfterKeyNode(23, 22);
        dll.display();
    }
}
