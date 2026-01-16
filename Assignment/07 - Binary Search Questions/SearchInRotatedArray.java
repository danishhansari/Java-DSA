public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 1;
        int ans = getAns(arr, target);
        System.out.println(ans);
    }

    public static int getAns  (int [] arr, int target) {
        int end = getPeak(arr);
        int startIndex = BinarySearch(arr, target, 0, end);
        if(startIndex != -1){
//            System.out.println("It is present in first half");
            return startIndex;
        } else {
            if(arr.length == 1){
                if(arr[0] == target) {
                    return 0;
                }else {
                    return -1;
                }
            }
            int lastIndex = BinarySearch(arr, target, end + 1, arr.length - 1);
            if(lastIndex != -1){
//                System.out.println("It is present in second Half");
                return lastIndex;
            } else {
//                System.out.println("It is not present anywhere in the array");
                return -1;
            }
        }
    }

    public static int BinarySearch(int [] arr, int target,int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start  +(end - start) / 2;
            if(isAsc){
                if(arr[mid] > target) {
                    end = mid - 1;
                } else if(arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] > target) {
                    start = mid + 1;
                } else if(arr[mid] < target) {
                    end = mid - 1;
                }
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static int getPeak(int [] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

}
