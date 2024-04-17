public class SolutionLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node middleElement() {

        if (head == null) {
            return null;
        }

        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public boolean findGivenElement(int key) {

        Node n = head;

        while (n != null) {
            if (n.data == key) {
                return true;
            }
            n = n.next;
        }
        return false;

    }

    public void printLinkedList() {

        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void insertNode(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {

        SolutionLinkedList ll = new SolutionLinkedList();

        ll.insertNode(5);
        ll.insertNode(4);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(1);

        ll.printLinkedList();

        Node middelElement = ll.middleElement();
        System.out.println(middelElement.data);

        int key = 3;

        boolean found = ll.findGivenElement(key);

        if (found == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
