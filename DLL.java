import org.w3c.dom.Node;

public class DLL {

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

    public void insertAfterNode(int newData) {

        Node newNode = new Node(newData);

        if (head == null) {
            System.out.println("Cannot Insert Node");
            return;
        }

        newNode.next = head.next;
        head.next = newNode;
        newNode.prev = head;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

    }

    public void insertAtEnd(int newData) {

        Node newNode = new Node(newData);
        Node n = head;

        if (head == null) {

            newNode = head;
            return;
        }

        while (n.next != null) {
            n = n.next;
        }

        n.next = newNode;
        newNode.prev = n;

    }

    public void insertAtGivenposition(int key, int newData){

        Node newNode = new Node(newData);
        Node n  = head;
        
        while(n != null && n.data != key){
    
        n = n.next;
        }

        if(n == null){
            System.out.println("Key Not Found");
            return;
        }
        
        newNode.next = n.next; 
        newNode.prev = n;
        if(n.next != null){
            n.next.prev = newNode;
        }
        n.next = newNode;
        
        }

        public void deleteAtEnd(){
            Node n = head;

            if (head == null) {
                System.out.println("List Not Exists");
                return;
            }

            while (n.next.next != null) {
                n = n.next;
            }

            n.next = null;
        }

        public void deleteGivenNode(int key){

            Node n = head;

            if (head == null) {
                System.out.println("List Not Exists");
                return;
            }

            while (n != null && n.data != key) {
                n = n.next;
            }
            n.next.prev = n.prev;
            n.prev.next = n.prev.next.next;


        }


        

    public void display() {
        Node n = head;
        Node p = head;

        while (n != null) {
            System.out.print(n.data + " ");
            // p=n;
            n = n.next;
        }
        System.out.println();

        // while( p != null){
        // System.out.print(p.data + " ");
        // p = p.prev;
        // }
    }

    public static void main(String[] args) {

        DLL dll = new DLL();

        dll.insertAtBegining(10);
        dll.insertAtBegining(20);
        dll.insertAtBegining(30);
        dll.display();

        dll.insertAfterNode(100);
        dll.display();

        dll.insertAtEnd(200);
        dll.display();

        dll.insertAtGivenposition(20,150);
        dll.display();

        dll.deleteAtEnd();
        dll.display();

        dll.deleteGivenNode(100);
        dll.deleteGivenNode(150);
        dll.display();
    }
}
