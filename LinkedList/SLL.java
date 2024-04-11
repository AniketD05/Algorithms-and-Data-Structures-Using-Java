package LinkedList;
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

    public void insertNodeAtGivenPosition(int key, int newData){

        Node newNode = new Node(newData);
        Node n = head;

        while(n != null && n.data != key){
            n = n.next;
        }

        if(n == null){
            System.out.println("Key Not found");
        }

        if(n.next == null){
            n.next = newNode;
            newNode.next = null;
        }
        newNode.next = n.next;
        n.next = newNode;
    }

    public void deleteGivenElement(int key){

        Node n = head;

        while (n != null && n.next.data != key) {
            n = n.next;
        }

        if(n == null){
            System.out.println("Key Not Found");
            return;
        }

        n.next = n.next.next;
        n.next.next = null;

    }

    public void deleteAtBegining(){
        if (head == null){
            System.out.println("List Doest Not Exists");
            return;
        }

       head = head.next;
    }

    public void deleteAtEnd(){
        Node n = head;
        if (head == null){
            System.out.println("List Doest Not Exists");
            return;
        }

        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;
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

        SLL sll = new SLL();

        sll.insertAtBegining(10);
        sll.insertAtBegining(20);
        sll.insertAtBegining(30);
        sll.insertAtBegining(40);
        sll.display();

        sll.insertNodeAtGivenPosition(20, 25);
        sll.display();

        sll.deleteGivenElement(25);
        sll.display();

        sll.deleteAtBegining();
        sll.display();
        
        sll.deleteAtEnd();
        sll.display();

    }
}
