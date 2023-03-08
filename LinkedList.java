public class LinkedList {
    Node head;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add-first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last into the linked list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node CurtNode = new Node(data);
        while (CurtNode.next != null) {
            CurtNode = CurtNode.next;
        }
        CurtNode.next = CurtNode;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node CurtNode = head;
        while (CurtNode != null) {
            System.out.print(CurtNode.data + " -> ");
            CurtNode = CurtNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        list.addLast("list");
        list.printList();
        System.out.println(list.getSize());
        list.printList();
    }
}
