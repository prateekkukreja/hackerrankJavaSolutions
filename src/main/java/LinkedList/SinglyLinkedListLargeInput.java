package LinkedList;

public class SinglyLinkedListLargeInput {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void insert(int data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void printList() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {

        SinglyLinkedListLargeInput ll = new SinglyLinkedListLargeInput();
        ll.insert(10);
        ll.insert(15);
        ll.insert(130);
        ll.insert(154);

        ll.printList();
    }

}
