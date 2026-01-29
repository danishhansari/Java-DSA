public class SearchInRotatedArray {
    public static void main(String[] args) {

        int [] arr = {15, 18, 2,3,6,12};
        int target = 6;
        int pivot = findPivot(arr);
        int ans = -1;
        if(pivot == -1){
            ans = binarySearch(arr, target, 0, arr.length - 1);
        }
        ans = binarySearch(arr, target, 0, pivot);
        if(ans == -1){
            ans = binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
        System.out.println("This is the ans " + ans);
    }

    public static int binarySearch(int [] arr, int target, int start, int end){
        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                end = mid -1 ;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int []arr){
        int max = 0;
        int start  = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid  - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid -1;
            }else {
                start = mid;
            }
        }
    return -1;
    }

}