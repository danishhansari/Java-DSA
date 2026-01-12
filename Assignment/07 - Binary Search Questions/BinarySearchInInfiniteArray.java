public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,8,9,
                10,11,12,13,14,15,16,17,
                18,19,20,21,22,23,24,25,
                26,27,28,29,30,31,32,33};
        int target = 6;

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end+1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        System.out.println(start + " " + end);
        System.out.println(binarySearch(arr, target, start, end));
    }
    public static int binarySearch(int [] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
