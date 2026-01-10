public class CeilingNumber {
    public static void main(String[] args) {
        int [] arr  = {2,3,5,9,14,16,18};
        int target = 17;
        System.out.println(arr[binarySearch(arr, target)]);
    }

    public static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]) {
            return end;
        }
        while (start<=end) {
            int mid = start + (end - start ) / 2;
            if(arr[mid] > target) {
                end = mid - 1;
            }
            if(arr[mid] < target) {
                start = mid + 1;
            }
            if(arr[mid] == target) {
                return mid;
            }
        }
        return start;
    }
}
