public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int [] arr= {1,2,4,5,6,7,8, 10, 10};
        System.out.println(isSorted(arr));

    }
    public static boolean isSorted(int []arr) {
        return helper(arr, 0);
    }

    public static boolean helper(int []arr, int i) {
        if(i >= arr.length - 1) return true;
        return arr[i] <= arr[i + 1] && helper(arr, i + 1);
        }
}
