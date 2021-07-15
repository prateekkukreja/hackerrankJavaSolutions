package LinkedList;

public class CreateDummyLinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void addElement(int data) {

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
        CreateDummyLinkedList ll = new CreateDummyLinkedList();
        ll.addElement(5);
        ll.addElement(10);
        ll.addElement(5);
        ll.addElement(10);
        ll.addElement(5);
        ll.addElement(10);

        ll.printList();
    }
}
