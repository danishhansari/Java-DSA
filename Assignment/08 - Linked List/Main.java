public class Main{
    public static void main(String [] args) {
        LinkList ll = new LinkList();
        ll.insertFirst(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insert(5, 2);
        ll.deleteFirst();
        ll.deleteLast();
        ll.insertLast(12);
        ll.delete(1);
        ll.display();
    }
}