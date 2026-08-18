public class SumOfNRecursion {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(sumOfN(number));
    }

    public static int sumOfN(int n) {
        if(n <= 1) {
            return 1;
        }
        return n + sumOfN(n- 1);
    }
}
