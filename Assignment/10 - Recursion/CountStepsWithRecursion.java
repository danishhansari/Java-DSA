public class CountStepsWithRecursion {
    public static void main(String[] args) {
        System.out.println(steps(8, 0));
    }
    public static int steps(int n, int count) {
        if (n == 0) {
            return count;
        }
        count = count + 1;
        if(n % 2 == 0) {
            n = n / 2;
        } else {
            n = n - 1;
        }
        return steps(n, count);
    }
}
