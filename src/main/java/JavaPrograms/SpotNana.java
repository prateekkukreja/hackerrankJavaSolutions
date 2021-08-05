import java.util.List;
import java.util.Scanner;

public class SpotNana {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int dataNew) {

        Node newNode = new Node(dataNew);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int del) {

        if (head == null)
            return;

        Node temp = head;

        if (del == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < del - 1; i++) {
            temp = temp.next;
            if (temp == null && temp.next == null) //
                return;

            Node next = temp.next;
            temp.next = next;
        }
    }

    public void peek() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        //8->2->3->1->7
        SpotNana list = new SpotNana();
        list.push(8);
        list.push(2);
        list.push(3);
        list.push(1);
        list.push(7);
        list.peek();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index to delete : ");
        int i = scan.nextInt();

        list.delete(i);

        list.peek();
    }
}



List<String> list = //div[@class='w3-white w3-padding notranslate w3-padding-16']//table[@id= 'customers']//tbody//tr
//th = list.get(0);

//tr[td[.='2'] and td[]]


//div[@class='w3-white w3-padding notranslate w3-padding-16']//table[@id= 'customers']//tbody//tr//td[contains(text(),'Maria')]




