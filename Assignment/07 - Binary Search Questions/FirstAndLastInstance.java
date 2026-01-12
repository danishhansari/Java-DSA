import java.util.Arrays;

public class FirstAndLastInstance {
    public static void main(String[] args) {
        int [] question = {5,7,7,8,8,10};
        int target = 8;
        int [] ans = {-1, -1};
        ans[0] = BinarySearch(question, target, true);
        ans[1] = BinarySearch(question, target, false);
//        ans[1] = invertedBinarySearch(question, target);
//        System.out.println(BinarySearch(question, target));
//        int [] ans = searchRange(question, target);

        System.out.println(Arrays.toString(ans));
    }

    public static int BinarySearch(int [] nums, int target, boolean isFirst) {
        int start = 0;
        int end  = nums.length - 1;
        int ans = -1;
        while (start <= end){
            int mid = start  +(end - start) / 2;
            if(nums[mid] > target) {
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isFirst) {
                    end = mid - 1;
                }else{
                    start = mid+ 1;
                }
            }
        }
        return ans;
     }


    public static int invertedBinarySearch(int [] nums, int target) {
        int start = 0;
        int end  = nums.length - 1;
        while (start <= end){
            int mid = start  +(end - start) / 2;

            if(nums[mid] == target) {
                if (nums[mid + 1] == target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            if(nums[mid] > target) {
                end = mid - 1;
            }
            if(nums[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {
            int[] ans = {-1, -1};
            ans[0] = getFirstIndex(nums, target);
            ans[1] = getSecondIndex(nums, target);
            return ans;
    }
    public static int getFirstIndex(int [] nums, int target){
            int ans = -1;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == target){
                    ans = i;
                    return ans;
                }
            }
            return ans;
    }
    public static int getSecondIndex(int [] nums, int target) {
            int ans = -1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    ans = i;
                    return ans;
                }
            }
            return ans;
    }
}
