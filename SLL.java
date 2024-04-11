public class SLL {

    Node head;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBegining(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    public void display() {

        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        SLL sll = new SLL();

        sll.insertAtBegining(10);
        sll.insertAtBegining(20);
        sll.insertAtBegining(30);
        sll.insertAtBegining(40);

        sll.display();

    }
}
