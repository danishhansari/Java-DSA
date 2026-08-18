public class PalindromeWithRecursion {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(palindrome(number));
    }

    public static boolean palindrome(int n) {
        int ans = 0;
        return n == reverse(n, ans);
    }

    public static int reverse(int n, int ans) {
        if(n <= 0) {
            return ans;
        }
        int last = n  % 10;
        ans = ans * 10 + last;
        n = n / 10;
        return reverse(n, ans);
    }

}
