import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int []{1,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i ++) {
            arr.add(nums[i]);
        }
        for(int i = 0; i < arr.size(); i ++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> kv: map.entrySet()) {
            if(kv.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
}
