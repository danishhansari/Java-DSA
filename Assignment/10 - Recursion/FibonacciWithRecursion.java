public class FibonacciWithRecursion {
    public static void main(String[] args) {
        fibo(5);
        System.out.println();
        System.out.println( fibonacci(5));
    }
    public static void fibo(int n ) {
        int first = 0;
        int second = 1;
        int third ;
        System.out.print(first + ", " + second);
        for(int i = 3; i < n; i ++) {
            third = first + second ;
            System.out.println( third);
            first = second;
            second = third;
        }
    }

    public static int fibonacci(int n ) {
        if(n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
