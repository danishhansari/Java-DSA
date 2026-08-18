public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1342;
        int ans = 0;
        System.out.println(sumOfDigi(number));
    }

    public static int sumOfDigi(int n) {
        if(n <= 0) {
            return 0;
        }
        return (n%10) + sumOfDigi(n/10);
    }
}
