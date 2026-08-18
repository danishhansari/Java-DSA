


// https://leetcode.com/problems/third-maximum-number/?envType=problem-list-v2&envId=array
public class Leetcode414 {
    public static void main(String[] args) {
        // third max
        int [] arr = {3,2,1};
        System.out.println(max(arr));

    }

    public static int max(int[] arr) {
        return thirdMax(arr);
    }

    public static int firstMax(int [] arr) {
        int firstMax = arr[0];
        for(int i = 1; i < arr.length; i ++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == firstMax) {
                ans = i;
            }
        }
        return ans;
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
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == secondMax) {
                ans = i;
            }
        }
        return ans;
    }

    public static int thirdMax(int []arr) {
        int firstMax = arr[0];
        int secondMax = arr[1];
        int thirdMax = arr[2];

        for(int i = 2; i < arr.length; i ++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            }
        }
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == thirdMax) {
                ans = i;
            }
        }
        return ans;
    }


}
