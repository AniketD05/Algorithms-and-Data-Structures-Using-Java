
public class FindMiddleOfLL {
    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int newData) {

        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void findMiddle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle Node  : " + slow.data);

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

        FindMiddleOfLL ll = new FindMiddleOfLL();

        ll.insert(8);
        ll.insert(7);
        ll.insert(6);
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
       
        ll.display();
        ll.findMiddle();
    }
}
