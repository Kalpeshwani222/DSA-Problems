import java.util.Scanner;

class Creation_Of_LL {
    Scanner sc = new Scanner(System.in);
    Node head = null;

    // creating the Structure of the LL
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at First
    public void addFirst(int data) {
        Node newNode = new Node(data); // pass the value to the Node class for ceating the New Node.
        // there are 2 possibilities
        // 1st is LL is exist
        // 2nd not exist
        if (head == null) {
            // LL is not exist then assign the head to the new node address.
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Insert At the Last
    public void addLast(int data) {
        Node newNode = new Node(data); // pass the value to the Node class for ceating the New Node.
        if (head == null) {
            // LL is not exist then assign the head to the new node address.
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert At specific Location
    public void addSpecific(int data) {
        System.out.println("Ent the pos");
        int p = sc.nextInt();

        Node newNode = new Node(data);

        Node temp1 = head;

        for (int i = 0; i < (p - 1); i++) {
            temp1 = temp1.next;
        }

        newNode.next = temp1.next;
        temp1.next = newNode;
    }

    // Delete At First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("LL is Empty");
        }

        // Node temp = head;
        // temp = temp.next;
        // head = temp;
        head = head.next;
    }

    // Delete At Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("LL is Empty");
        }

        Node secondLast = head;
        Node lastNode = secondLast.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Delete At specific location
    public void deleteSpecific() {
        int pos;
        System.out.println("Enter the pos");
        pos = sc.nextInt();

        Node temp2 = head;
        Node ptr1 = temp2.next;

        for (int i = 0; i < pos - 2; i++) {
            temp2 = ptr1;
            ptr1 = ptr1.next;
        }
        temp2.next = ptr1.next;

    }

    // print the LL
    public void printList() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Creation_Of_LL list = new Creation_Of_LL();
        list.addFirst(10);
        list.addFirst(20);

        list.printList();
        System.out.println();

        list.addLast(30);
        list.addLast(40);

        list.printList();

        System.out.println();
        // list.addSpecific(50);
        // list.printList();

        System.out.println();
        list.deleteFirst();
        list.printList();

        // System.out.println();
        // list.deleteLast();
        // list.printList();
        System.out.println();
        list.deleteSpecific();

        list.printList();
    }
}
