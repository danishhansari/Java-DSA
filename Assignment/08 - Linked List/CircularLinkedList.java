package main.java;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(" --- " + node.value);
                node = node.next;
            } while (node != head);
        }
        System.out.println();
    }

    public void displayReverse() {
        Node node = tail;
        if(tail != null) {
            do {
                System.out.print(" --- " + node.value);
                node = node.next;
            } while (node != tail);
        }
        System.out.println();
    }

    public void delete(int value) {
        Node node = head;
        if(node == null) {
            return;
        }

        i
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
        }
    }
}
