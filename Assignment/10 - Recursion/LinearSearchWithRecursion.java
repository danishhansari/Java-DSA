public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int [] arr = {1,0, 3, 9, 2, 4, 8};
        int target = 8;

        System.out.println(search(arr, target, 0));
    }

    public static int search (int [] arr, int target, int i) {
        if(i >= arr.length) {
            return -1;
        }
        if(arr[i] == target) {
            return i;
        }
        return search(arr, target, ++i);
    }
}
