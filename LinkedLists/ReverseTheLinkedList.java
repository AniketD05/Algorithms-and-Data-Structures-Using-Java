
public class ReverseTheLinkedList {

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

    public void createDLL(int data){

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
        newNode.prev = n;
    }

    public Node reverseDLL(){

        Node n = head;

        Node temp = null;

        if (head == null || head.next == null) {
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

    public void display(){


        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void displayRev(Node head){


        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args){

        ReverseTheLinkedList rdll = new ReverseTheLinkedList();

        rdll.createDLL(10);
        rdll.createDLL(20);
        rdll.createDLL(30);
        rdll.createDLL(40);

        rdll.display();

        Node result = rdll.reverseDLL();

        rdll.displayRev(result);
    }
}
