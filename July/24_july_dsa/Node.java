class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Insert after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete from the beginning
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete from the end
    public void deleteFromEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = lastNode;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    // Delete after a given node
    public void deleteAfter(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("The given node cannot be null or it has no next node");
            return;
        }
        prevNode.next = prevNode.next.next;
    }

    // Traverse the list
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Search for a node
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Update a node's value
    public void update(int oldValue, int newValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAfter(list.head.next, 25);

        System.out.println("Linked list after insertion:");
        list.traverse();

        list.deleteFromBeginning();
        list.deleteFromEnd();
        list.deleteAfter(list.head);

        System.out.println("Linked list after deletion:");
        list.traverse();

        System.out.println("Searching for 25: " + list.search(25));

        list.update(20, 50);
        System.out.println("Linked list after updating 20 to 50:");
        list.traverse();
    }
}
