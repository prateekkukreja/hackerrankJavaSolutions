package LinkedList;

public class SinglyLinkedListLargeInput {

    Node head;

    public void insert(int data) {
        Node node = new Node();
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
