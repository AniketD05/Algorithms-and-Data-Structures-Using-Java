package LinkedList;
public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtFront(int newdata){
        Node newNode = new Node(newdata);

        newNode.next = head;

        head = newNode;
    }

    public void insertAtEnd(int newdata){

        Node newNode = new Node(newdata);

        if(head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while( last.next != null){
            last = last.next;
        }
        last.next = newNode;


    }

    public void insertBetween(Node prevNode, int newdata){

        if(prevNode == null){
            return;
        }

        Node newNode = new Node(newdata);
        newNode.data = newdata;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void display() {

        Node n = head;
        while (n != null) {
            System.out.print(n.data + " --> ");
            n = n.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtFront(1);
        list.insertAtFront(2);
        list.insertAtFront(3);
        list.insertAtFront(4);
        System.out.println("Before inserting ---->");
        list.display();

        list.insertAtEnd(10);
        System.out.println("After inserting ---->");
        list.display();

        list.insertBetween(list.head, 9);
        System.out.println("After inserting in between");
        list.display();
    }
}
