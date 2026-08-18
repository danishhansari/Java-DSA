public class NumberWithoutRecursion {
    public static void main(String[] args) {
        print1(1);
    }

    public static void print1(int i) {
        System.out.println(i);
        print2(2);
    }

    public static void print2(int i) {
        System.out.println(i);
        print3(3);
    }

    public static void print3(int i) {
        System.out.println(i);
        print4(4);
    }

    public static void print4(int i) {
        System.out.println(i);
        print5(5);
    }

    public static void print5(int i) {
        System.out.println(i);
    }
}
