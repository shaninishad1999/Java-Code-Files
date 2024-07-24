class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Method to add a node at the start of the list
    public Node addAtStart(Node head, int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Method to add a node at the end of the list
    public Node addAtEnd(Node head, int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    // Method to print the data in the list
    public void printData(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("==>" + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        // Create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Link nodes to form a list
        Node head = first;
        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;

        // Print the original list
        System.out.println("Print Data of Singly Linked List:");
        head.printData(head);

        // Add a node at the start
        head = head.addAtStart(head, 5);
        System.out.println("\nAfter adding a new node at the start:");
        head.printData(head);

        // Add a node at the end
        head = head.addAtEnd(head, 50);
        System.out.println("\nAfter adding a new node at the end:");
        head.printData(head);
    }
}
