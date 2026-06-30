package main.java;

public class DoublyLinkedLIst {

    private int size;
    private Node head;
    private Node prev;


    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        Node last = head;
        if(head == null) {
            newNode.prev =  null;
            head = newNode;
            return;
        }
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
        size++;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print("-----  " + node.value);
            node = node.next;
        }
        System.out.println(" NORMAL ");
    }

    public void displayReverse() {
        Node node = head;
        Node last = null;
        while(node != null) {
            last = node;
            node = node.next;
        }
        while(last != null) {
            System.out.print(" -- " + last.value);
            last = last.prev;
        }
        System.out.println("  REVERSED ");
    }

    public void insert(int index, int value) {
        Node p = get(index);
        if(p == null) {
            System.out.println("index doesn't exits");
            return ;
        }
        Node node = new Node(value);
        node.prev = p;
        node.next = p.next;
        p.next = node;
        if(node.next != null) {
            node.next.prev = node;
        }
    }

    public void insertAfter(int after, int value) {
        Node p = find(after);
        if(p == null) {
            System.out.println("It is not present here");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if(node.next != null) {
            node.next.prev = node;
        }
    }

    public Node get(int index) {
        Node temp = head;
        for ( int i = 0; i < index; i ++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value) {
        Node temp = head;
        while(temp != null) {
            if(temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
