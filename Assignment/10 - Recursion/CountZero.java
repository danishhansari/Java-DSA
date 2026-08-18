public class CountZero {
    public static void main(String[] args) {
        int n = 12001200;
        int ans = count(n);
        System.out.println(ans);
    }

    public static int count(int n) {
        return countZero(n, 0, 0);
    }

    public static int countZero(int n,int digit, int count) {
        if(n == 0) {
            return count;
        }
        if(n % 10 == digit) count++;

        return countZero(n / 10, digit , count);
    }
}
