public class ReverseDigitWithRecursion {
    public static void main(String[] args) {
        int n = 1425;
        int ans = 0;
        System.out.println(reverse(n, ans));

    }

    public static int reverse(int n, int ans) {
        if(n <= 0) {
            return ans;
        }
        int last = n % 10;
        ans = ans * 10 + last;
        n = n / 10;

        return reverse(n, ans);
    }
}
