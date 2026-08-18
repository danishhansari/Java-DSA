public class Leetcode747 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        System.out.println(dominantIndex(arr));
    }

    public static int dominantIndex(int[] nums) {
        int maximum = max(nums);
        int secondMax = secondMax(nums);
        return secondMax;
    }

    public static int max(int [] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int secondMax(int []arr) {
        int firstMax = arr[0];
        int secondMax = arr[1];

        for(int i = 1; i < arr.length; i ++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
        }

        return secondMax;
    }
}
