public class LinkList {
    private int size;
    private Node head;
    private Node tail;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteFirst() {
        Node temp = head;
        head = head.next;
        size--;
    }

    public void delete(int index) {
        if(index == 0) {
            deleteFirst();
        }
        if(index == size) {
            deleteLast();
        }

        Node temp = get(index - 1);
        temp.next = temp.next.next;
        size--;
    }

    public void deleteLast() {
        Node secondLast = get(size - 2);
        secondLast.next = null;
        tail = secondLast;
        size--;
    }

    public Node get(int index) {
        Node temp = head;
        for ( int i = 0 ; i < index; i ++) {
            temp  = temp.next;
        }
        return temp;
    }

    public void insert(int val, int index) {
        Node temp = head;
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        for(int i = 1; i < index; i ++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        for (int i = 0 ; i < size; i ++) {
            System.out.print("--- " + temp.value);
            temp = temp.next;
        }
    }

    public class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
