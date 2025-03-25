public class LinkedLists {
    // Inner Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Instance variable for the head of the list
    private Node head;

    // Constructor to initialize an empty list
    public LinkedLists() {
        this.head = null;
    }

    // Add a node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();
    }
}