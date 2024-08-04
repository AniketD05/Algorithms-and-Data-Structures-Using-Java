import org.w3c.dom.Node;

public class Test {

    Node head;

    class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public void insertAtFront(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void insertAfter(int key, int data){

        Node newNode = new Node(data);

        Node n = head;

        if(head == null){
            head = newNode;
            return;
        }

       while(n != null && n.data != key){
        n = n.next;
       }

       if(n == null){
        System.out.println("Key not found");
        return;
       }

       newNode.next = n.next;
       newNode.prev = n;
       
       if(n.next != null){
        n.next.prev = newNode;
       }
       n.next = newNode;

    }

    public void display() {

        Node n = head;
        Node p = null;
        System.out.println("\n-------------------Forward Direction-------------------");
        while (n != null) {

            System.out.print(n.data + " ");
            p = n;
            n = n.next;
        }

        System.out.println();

        // System.out.println("\n-------------------Forward Direction-------------------");

        // while(p != null){
        //     System.out.print(p.data + " ");
        //     p = p.prev;
        // }
    }

    public static void main(String[] args) {

        Test t = new Test();

        t.insertAtFront(10);
        t.insertAtFront(30);

        t.display();

        t.insertAfter(30, 20);

        t.display();
    }
}