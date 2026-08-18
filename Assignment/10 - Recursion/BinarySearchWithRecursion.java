public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int ans = binarySearch(arr, 8);
//         System.out.println(ans);
        System.out.println(binarySearchWithRecursion(arr, 8, 0, arr.length - 1));
    }
    public static int binarySearchWithRecursion(int [] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return binarySearchWithRecursion(arr, target, start, --mid);
        }
        return binarySearchWithRecursion(arr, target, ++mid, end);

    }

    public static int binarySearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[start] == target) {
                return start;
            }
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[end] == target) {
                return end;
            }

            if(arr[mid] < target) {
                start = mid + 1;
            }

            if(arr[mid] > target) {
                end = mid - 1;
            }



        }
        return -1;
    }
}
