package LinkedList;
import org.w3c.dom.Node;

public class MergeTwoLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtBegining(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void mergeLists(MergeTwoLinkedList dll2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        Node n1 = head;
        Node n2 = dll2.head;

        while (n1 != null && n2 != null) {
            if (n1.data > n2.data) {
                tail.next = n1;
                n1.prev = tail;
                n1 = n1.next;
            } else {
                tail.next = n2;
                n2.prev = tail;
                n2 = n2.next;
            }
            tail = tail.next;
        }

        while (n1 != null) {
            tail.next = n1;
            n1.prev = tail;
            n1 = n1.next;
            tail = tail.next;
        }

        while (n2 != null) {
            tail.next = n2;
            n2.prev = tail;
            n2 = n2.next;
            tail = tail.next;
        }

        head = dummy.next;
        head.prev = null;
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
        MergeTwoLinkedList dll1 = new MergeTwoLinkedList();
        MergeTwoLinkedList dll2 = new MergeTwoLinkedList();

        dll1.insertAtBegining(10);
        dll1.insertAtBegining(20);
        dll1.insertAtBegining(30);
        dll1.insertAtBegining(40);
        dll1.insertAtBegining(50);
        System.out.println("List 1 -->");
        dll1.display();

        dll2.insertAtBegining(100);
        dll2.insertAtBegining(200);
        dll2.insertAtBegining(300);
        dll2.insertAtBegining(400);
        dll2.insertAtBegining(500);
        System.out.println("List 2 -->");
        dll2.display();

        dll1.mergeLists(dll2);
        System.out.println("Merged List-->");
        dll1.display();
    }
}
