class Nod {
    int data;
    Nod next;

    public Nod(int data) {
        this.data = data;
        this.next = null;
    }

    public void printdisplay(Nod head) {
        if (head == null) {
            System.out.println("Node is empty");
        } else {
            Nod temp = head;
            while (temp != null) {
                System.out.println("===> " + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {
        Nod first = new Nod(10);
        Nod second = new Nod(20);
        Nod third = new Nod(30);
        Nod four = new Nod(40);
        Nod fifth = new Nod(50);
        Nod head = first;

        head.next = second;
        head.next.next = third;
        head.next.next.next = four;
        head.next.next.next.next = fifth;

        System.out.println("List singly");
        head.printdisplay(head);
    }
}
