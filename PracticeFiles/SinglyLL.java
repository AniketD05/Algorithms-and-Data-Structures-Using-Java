public class SinglyLL {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAfterKey(int data, int key) {

        Node newNode = new Node(data);

        Node n = head;

        if (head == null) {
            head = newNode;
            return;
        }

        while (n != null) {

            if (n.data == key) {
                newNode.next = n.next;
                n.next = newNode;
                return;
            }
            n = n.next;
        }

        System.out.println("Key is not present");

    }

    public void insertAtEnd(int data){

        Node newNode = new Node(data);
        Node n = head;

        if(head == null){
            head = newNode;
            return;
        }

        while(n.next != null){

            n = n.next;
        }

        n.next = newNode;

    }

    public void insertAtBegining(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head.next;
        head.next = newNode;

    }

    public void insertAtMiddle(int data){

        Node newNode = new Node(data);

        Node slow = head;
        Node fast = head;

        if(head == null || head.next == null ){
            System.out.println("operation cannot be done!");
            return;
        }

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow.next;
        slow.next = newNode;
    }

    public void deleteAtBegining(){

        if(head == null && head.next == null){
            System.out.println("Operation cannot be done");
            return;
        }

        head = head.next;

    }

    public void deleteAtEnd(){

        Node n = head;

        while(n.next.next != null){
            n = n.next;
        }

        n.next = null;
    }

    public void displayll() {

        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SinglyLL sll = new SinglyLL();

        
        sll.insertAtBegining(10);
        sll.insertAtBegining(40);
        sll.insertAtBegining(30);
        sll.insertAtBegining(20);
        sll.displayll();
        sll.insertAfterKey(100, 300);
        sll.displayll();
        //sll.insertAtEnd(200);

        //sll.insertAtMiddle(500);

        sll.deleteAtBegining();

        sll.displayll();

        sll.deleteAtEnd();

        sll.displayll();

        sll.insertAtBegining(15);

        sll.displayll();

        sll.deleteAtEnd();

        sll.displayll();
    }
}
