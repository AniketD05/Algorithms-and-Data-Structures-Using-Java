public class DetectLoop {

    static Node head;

    static class Node {

        int data;
        Node next;
        boolean visited;

        Node(int data) {

            this.data = data;
            this.next = null;
            this.visited = false;
        }
    }

    public void display() {

        Node n = head;

        if (head == null) {
            return;
        }
        int count = 0;
        while (n != null && count < 5) {
            System.out.print(n.data + " ");
            n = n.next;
            count++;
        }
    }

    public boolean detectLoop() {

        Node n = head;
        
        for(Node i = head; i != null; i = i.next){

            if (!i.visited) {
                i.visited = true;
                continue;
            }

            if (i.visited) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoop d = new DetectLoop();
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next.next;

       System.out.println(d.detectLoop());
    }
}
